/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-22
 * Time: 21:58
 **/
import java.util.*;

public class Finder {
    public static Integer findKth(int[] a, int n, int K) {
        qSort(a);
        if (K > n || K < 1){
            return null;
        }
        if (n == 0){
            return null;
        }
        return a[K];


    }
    public static void qSort(int[] array){
        qSortHelper(array,0,array.length-1);

    }

    public static void qSortHelper(int[] array,int lowIndex,int highIndex){

        int size = highIndex-lowIndex+1;
        if (size <= 1){
            return;
        }
        int keyIndex = partition(array,lowIndex,highIndex);
        qSortHelper(array,lowIndex,keyIndex-1);
        qSortHelper(array,keyIndex+1,highIndex);

    }

    public static int partition(int[] array,int lowIndex,int highIndex){
        int left = lowIndex;
        int right = highIndex;
        int key = array[lowIndex];
        while(left < right){
            while(left < right && array[right] <= key){
                right--;
            }

            while(left < right && array[left] >= key){
                left++;
            }
            swap(array,left,right);

        }
        swap(array,lowIndex,left);
        return lowIndex;

    }

    private static void swap(int[] array, int x, int y) {
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }


    public static void main(String[] args) {
        int[] array = {1,3,5,2,2};
        System.out.println(findKth(array, array.length, 3));
    }

}