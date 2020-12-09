/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-09
 * Time: 21:15
 **/

import java.util.Arrays;
import java.util.Scanner;

/**
 * 洗牌问题：（1）输入的第一个变量表示要洗牌的组数
 *         (2)输入的第二个变量表示n
 *         (3)输入的第三个变量表示洗牌的次数
 *
 * */
public class Main1 {
    //k表示洗牌的次数
    public static void shuffle(int[] array,int k){
        int flg = 0;
        while(k > 0){
            int[] ret = Arrays.copyOf(array,array.length);
            for (int i = 0; i < array.length; i += 2) {
                array[i] = ret[flg++];
            }
            for (int i = 0; i < array.length; i += 2) {
                array[i] = ret[flg++];
            }
            k--;
            flg=0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        while(in.hasNextInt()){
            int len = in.nextInt();
            int val = in.nextInt();
            int[] arr = new int[len * 2];
            for (int i = 0; i < len * 2; i++) {
                arr[i] = in.nextInt();
            }
            //有几组数需要处理
            //需要被洗牌几次
            shuffle(arr, val);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i == arr.length - 1) {
                    System.out.println();
                    break;
                }
                System.out.print(" ");
            }
            count--;
        }
    }
}
