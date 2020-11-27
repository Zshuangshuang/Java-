import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-27
 * Time: 20:04
 **/
public class Main {
    public static boolean isSorted(int[] array,int n){
        for (int i = 1; i < n-1; i++) {
            if (array[i] > array[i-1] &&array[i] > array[i+1] || array[i] < array[i-1] && array[i] < array[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String[] ret = scanner.nextLine().split(" ");
        int[] array = new int[ret.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(ret[i]);
        }
        if (isSorted(array,num)){
            System.out.println("sorted");
        }else {
            System.out.println("unsorted");
        }
    }
}

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String[] ret = scanner.nextLine().split(" ");
        int[] array = new int[ret.length];
        for (int i = 0; i < ret.length; i++) {
            array[i] = Integer.parseInt(ret[i]);
        }
        Arrays.sort(array);
        int minScore = array[0];
        int maxScore = array[array.length-1];
        System.out.println(maxScore-minScore);
    }
}*/

   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String[] ret = scanner.nextLine().split(" ");
        int[] array = new int[ret.length];
        int sum = 0;
        for (int i = 0; i < ret.length; i++) {
            array[i] = Integer.parseInt(ret[i]);
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
*/
  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int positive = 0;
        int negative = 0;
        String[] ret = str.split(" ");
        int[] array = new int[ret.length];
        for (int i = 0; i < ret.length; i++) {
            array[i] = Integer.parseInt(ret[i]);
        }
        for (int i = 0; i < array.length; i++) {
                if (array[i] > 0){
                    positive++;
                }else{
                    negative++;
                }
        }
        System.out.println("positive:"+positive);
        System.out.println("negative:"+negative);
    }
}*/
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] ret = str.split(" ");
        int[] array = new int[ret.length];
        for (int i = 0; i < ret.length; i++) {
            array[i] = Integer.parseInt(ret[i]);
        }
        for (int x: array){
            System.out.println(x+" ");
        }
    }
}*/
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String[] ret = str1.split(" ");
        int row = Integer.parseInt(ret[0]);
        int col = Integer.parseInt(ret[1]);
        int sum = 0;
        for (int i = 0; i < row; i++) {
            String str2 = scanner.nextLine();
            String[] s = str2.split(" ");
            for (int j = 0; j < col; j++) {
                if (Integer.parseInt(s[j]) > 0){
                    sum += Integer.parseInt(s[j]);
                }
            }
        }
        System.out.println(sum);
    }
}*/
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String[] str = str1.split(" ");
        if (str[0].equals(str[1])){
            System.out.println("same");
        }else {
            System.out.println("different");
        }
    }
}*/
    /*//有一个有序数字序列，从小到大排序，将一个新输入的数插入到序列中，保证插入新数后，序列仍然是升序。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str1 = scanner.nextLine();
            int numLen = Integer.parseInt(str1);
            String str2 = scanner.nextLine();
            String[] ret = str2.split(" ");
            int[] array = new int[ret.length+1];
            for (int i = 0; i < ret.length; i++) {
                array[i] = Integer.parseInt(ret[i]);
            }
            String str3 = scanner.nextLine();
            int newNum = Integer.parseInt(str3);
            array[array.length-1] = newNum;
            Arrays.sort(array);
            for (int x : array){
                System.out.println(x+" ");
            }
        }
    }
}*/
