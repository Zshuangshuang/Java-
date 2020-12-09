/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-09
 * Time: 21:33
 **/

import java.io.IOException;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-07-18
 * Time:19:41
 */
public class Main2 {
    public static void main(String[] args)  {
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
            changeArr(arr, val);
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

    private static void changeArr(int[] arr, int k) {
        int pop = 0;
        while(k > 0){
            int[] arr1 = Arrays.copyOf(arr,arr.length);
            for (int i = 0; i < arr.length; i += 2) {
                arr[i] = arr1[pop++];
            }
            for (int i = 1; i < arr.length; i += 2) {
                arr[i] = arr1[pop++];
            }
            k--;
            pop = 0;
        }
    }
}