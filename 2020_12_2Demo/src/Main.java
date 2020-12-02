import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-02
 * Time: 20:35
 **/
public class Main {


    public static void main(String[] args) {

       int j;
       boolean flag;
       int count = 0;
        for (int i = 100; i < 1000; i++) {
            flag = false;
            for (j = 2; j < i/2; j++) {
                if (i %j == 0){
                    flag = true;
                    break;
                }
            }
            if (flag == false){
             count++;
            }
        }
        System.out.println(count);
    }
}
   /* public static int times(int[] array,int n){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       String str1 = bufferedReader.readLine();
       int n = Integer.parseInt(str1);
       String[] ret = bufferedReader.readLine().split(" ");
       int[] array = new int[ret.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(ret[i]);
        }
        String str3 = bufferedReader.readLine();
        int toFind = Integer.parseInt(str3);
        System.out.println(times(array, toFind));
    }
}*/
   /* public static int max(int a,int b,int c){
        int max = 0;
        if (a >= b){
            if (a >= c){
                max = a;
            }else {
                max = c;
            }
        }else {
            if (b >= c){
                max = b;
            }else {
                max = c;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ret = scanner.nextLine().split(" ");
        int a = Integer.parseInt(ret[0]);
        int b = Integer.parseInt(ret[1]);
        int c = Integer.parseInt(ret[2]);
        int n1 = max(a+b,b,c);

        int n2 = max(a,b+c,c);

        int n3 = max(a,b,b+c);

        double result = 0.0;
        result = n1*1.0/(n2+n3);
        System.out.printf("%.2f",result);
    }
}*/
    /*public static int sumOfFab(int n){
        int sum = 0;
        int fab = 1;
        for (int i = 1; i <= n; i++) {
                fab = 1;
            for (int j = 1; j <= i; j++) {
               fab *= j;
            }
            sum += fab;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfFab(n));
    }
}*/
   /* public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j+1] > array[j]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ret = scanner.nextLine().split(" ");
        int[] array = new int[ret.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(ret[i]);
        }
        bubbleSort(array);
        System.out.println(array[0]);
    }
}*/

    /*public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        char[] ch = str.toCharArray();
        long c = 0;
        long h = 0;
        long n = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'C'){
                c++;
            }else if(ch[i] == 'H'){
                h = h+c;
            }else if (ch[i] == 'N'){
                n = h+n;
            }

        }
        System.out.println(n);
    }
}*/
    //输出一行，为去重排序后的序列，每个数后面有一个空格。
    /*public static Set<Integer> avoidCh(int[] array, int n){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(array[i]);
        }
        return set;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
           Set<Integer> set = avoidCh(array,n);
           for (int x:set){
               System.out.print(x+" ");
           }
        }


    }
}
*/