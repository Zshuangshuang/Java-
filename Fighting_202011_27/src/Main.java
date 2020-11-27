import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-27
 * Time: 22:06
 **/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ret = scanner.nextLine().split(" ");
        int n1 = Integer.parseInt(ret[0]);
        int n2 = Integer.parseInt(ret[1]);
        String[] str1 = scanner.nextLine().split(" ");
        int[] array1 = new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            array1[i] = Integer.parseInt(str1[i]);
        }
        String[] str2 = scanner.nextLine().split(" ");
        int[] array2 = new int[str2.length];
        for (int i = 0; i < str2.length; i++) {
            array2[i] = Integer.parseInt(str2[i]);
        }
        int[] array = new int[n1+n2];
        for (int i = 0; i < n1; i++) {
            array[i] = array1[i];
        }
        for (int i = n1; i < n1+n2; i++){
            array[i] = array2[i-n1];
        }
        Arrays.sort(array);
        for (int x:array){
            System.out.print(x+" ");
        }
    }
}
  /*  public static void  delRepeat(int[] array){
       List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!(list.contains(array[i]))){
                list.add(array[i]);
            }
        }
        for (int x : list){
            System.out.print(x+" ");
        }
    }
//    对这个序列中每个重复出现的整数，只保留该数第一次出现的位置，删除其余位置不变。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] ret = scanner.nextLine().split(" ");
        int[] array = new int[ret.length];
        for (int i = 0; i < ret.length; i++) {
            array[i] = Integer.parseInt(ret[i]);
        }
         delRepeat(array);

    }
}*/
   /* public static List<Integer> deleteNum(int[] array,int toDelete){
        List<Integer> list = new ArrayList<>();
        if (array == null){
            return null;
        }
        //遍历array，如果array[i]=toDelete，那么就把这个元素入list,最终返回list
        for (int x : array){
            if (x != toDelete){
                list.add(x);
            }
        }
        return list;
    }
    //现删除指定的某一个整数，输出删除指定数字之后的序列，序列中未被删除数字的前后位置没有发生改变。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String[] ret = scanner.nextLine().split(" ");
        int[] array = new int[ret.length];
        for (int i = 0; i < ret.length; i++) {
            array[i] = Integer.parseInt(ret[i]);
        }
        int toDel = Integer.parseInt(scanner.nextLine());
        List<Integer> list = deleteNum(array,toDel);
        for (int x:list){
            System.out.print(x+" ");
        }
    }
}*/
/*
//有一个有序数字序列，从小到大排序，将一个新输入的数插入到序列中，保证插入新数后，序列仍然是升序。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String[] ret = scanner.nextLine().split(" ");
        int[] array = new int[ret.length+1];
        for (int i = 0; i < ret.length; i++) {
            array[i] = Integer.parseInt(ret[i]);
        }
        int newNum = Integer.parseInt(scanner.nextLine());
        array[array.length-1] = newNum;
        Arrays.sort(array);
        for (int x : array){
            System.out.print(x+" ");
        }
    }
}
*/
