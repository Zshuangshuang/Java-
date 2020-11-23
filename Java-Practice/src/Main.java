import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-23
 * Time: 20:28
 **/
public class Main {
    /*用筛选法求n以内的素数。筛选法求解过程为：将2~n之间的正整数放在数组内存储，将数组中2之后的所有能被2整除的数清0
    再将3之后的所有能被3整除的数清0 ，以此类推，直到n为止。数组中不为0 的数即为素数。*/
    //思路：先创建一个数组，将这些数字装进数组；
    //判断数组中的数字是否为素数，如果不是素数，则将该数字打印;
    //若是，则将该数字置0
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int[] array = new int[num];
        for (int i = 2; i <= num; i++) {
                array[i-2] = i;
        }
        for (int i = 2; i < num; i++) {
            for (int j = i; j < num; j++) {
                    if (array[j-1] % i == 0){
                        array[j-1] = 0;
                    }
            }
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0){
                System.out.print(array[i]+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println(num-count-1);

    }

   /* public static void main(String[] args) throws IOException{
        *//*第一行输入一个整数(0≤N≤50)
第二行输入N个升序排列的整数，输入用空格分隔的N个整数
第三行输入想要进行插入的一个整数
输出为一行，N+1个有序排列的整数*//*

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String s = bufferedReader.readLine();
        int n2 = Integer.parseInt(bufferedReader.readLine());
        String[] ret = s.split(" ");
        int[] array = new int[n+1];
        for (int i = 0; i < ret.length; i++) {
            array[i] = Integer.parseInt(ret[i]);
        }
        array[n] = n2;
        Arrays.sort(array);
        for (int x:array) {
            System.out.print(x+" ");
        }
        }*/

    }
   /* //一行，输出去掉最高分和最低分的平均成绩，小数点后保留2位，每行输出后换行

    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String[] ret = s.split(" ");

        double sum = 0;
        double[] array = new double[ret.length];
        for (int i = 0; i < ret.length; i++) {
            double tmp = Double.parseDouble(ret[i]);
            array[i] = tmp;
        }
        Arrays.sort(array);
        for (int i = 1; i < array.length-1; i++) {
            sum+=array[i];
        }
        double avg = sum/(array.length-2);
        System.out.printf("%.2f",avg);
    }*/

