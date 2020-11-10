import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-10
 * Time: 10:10
 **/
public class TestDemo {

    //给定一个整型数组, 实现冒泡排序(升序排序)

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean ret = false;
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    ret = true;
                }
            }
            if (!ret){
                break;
            }
        }

    }
    //给定一个整型数组, 判定数组是否有序（递增）
    public static boolean isOrdered(int[] array){
        for (int i = 0; i < array.length-1; i++){
            if (array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }
    //给定一个有序整型数组, 实现二分查找
    public static int binarySearch(int[] array,int x){
        int left = 0;
        int right = array.length-1;
        while (left <= right){
            int middle = (left+right)/2;
            if (array[middle] > x){
                right = middle-1;
            }else if (array[middle] == x){
                return middle;
            }else {
                left = middle+1;
            }
        }
        return -1;
    }
    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
    public static int[] copyOf(int[] array){
        int[] arr = new int[array.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }
    //实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]"
    public static String toString(int[] array){
        String str = "";
        str += "[";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if (i < array.length-1){
                str += ",";
            }
        }
        return str+"]";
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,5,6};
        String ret = toString(array);
        System.out.println(ret);

    }

    public static void main2(String[] args) {
        int[] array = {9,2,3,4,5,6};
        boolean ret = isOrdered(array);
        System.out.println(ret);

    }
    public static void main1(String[] args) {
        int[] array = {6,4,2,1,3,5};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }
}
