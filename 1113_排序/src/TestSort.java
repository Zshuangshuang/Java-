import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-13
 * Time: 20:21
 **/
public class TestSort {
    //冒泡排序性能分析：
    //(1)时间复杂度：O(n^2)
    //(2)空间复杂度：O（1）
    //(3)稳定性：稳定

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length-1-i; j++) {

                if (array[j+1] < array[j]){
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                    flg = true;
                }

            }
            if (!flg){
                break;
            }

        }
    }

    //性能分析：
    //(1)时间复杂度：O(nLogN)
    //(2)空间复杂度：升序建小堆是O(n).升序建大堆是O(1)
    //稳定性：不稳定

    public static void heapSort(int[] array){
        //基本思想：(1)先将数组建成堆
        //(2)将堆顶元素和堆中的最后一个元素交换位置
        //(3)将堆中的最后一个元素从队中删除
        //(4)对堆顶元素进行向下调整
        createHeap(array);
        for (int i = 0; i < array.length-1; i++) {
            //交换的是堆顶元素和堆中的最后一个元素
            swap(array,0,array.length-1-i);
            //对堆顶元素进行向下调整
            shiftDown(array,array.length-1-i,0);
        }

    }

    private static void shiftDown(int[] array, int heapLength, int index) {
        while(true){
            //找到左孩子
            int leftIndex = index*2+1;
            if (leftIndex >= heapLength){
                break;
            }
            int rightIndex = leftIndex+1;
            int maxIndex = leftIndex;
            if (rightIndex < heapLength && array[rightIndex] > array[maxIndex]){
                maxIndex = rightIndex;
            }
            if (array[maxIndex] > array[index]){
                swap(array,maxIndex,index);
            }else {
                break;
            }
            index = leftIndex;
            leftIndex = leftIndex*2+1;
        }
    }

    private static void swap(int[] array, int heapTop, int heapTail) {
        int tmp = array[heapTop];
        array[heapTop] = array[heapTail];
        array[heapTail] = tmp;
    }

    private static void createHeap(int[] array) {
        //从最后一个非叶子节点出发向前循环，一次向下调整
        for (int i = (array.length-1-1)/2; i >= 0; i--) {
            shiftDown(array,array.length,i);

        }
    }
    //选择排序性能分析
    //(1)时间复杂度：O(n^2)
    //(2)空间复杂度：O(1)
    //(3)稳定性：不稳定


    public static void selectSort(int[] array){
        //选择排序的基本思路：(1)将整个数组分为已排序区间[0,bound)和待排序区间[bound,array.length)
        //(2)循环取出待排序区间的元素去和已排序区间元素进行比较
        //(3)若待排序区间元素小于已排序区间元素，那么他们就交换位置
        for (int bound = 0; bound < array.length; bound++) {
            for (int cur = bound+1; cur < array.length; cur++) {
                if (array[cur] < array[bound]){
                    int tmp = array[cur];
                    array[cur] = array[bound];
                    array[bound] = tmp;
                }
            }
        }

    }
    //希尔排序性能分析
    //时间复杂度：理论上时间复杂度为O(n^1.3)，如果按照下面方法的时间复杂度为O(n^2)
    //空间复杂度：O(1)
    //稳定性：不稳定

    public static void shellSort(int[] array){
        //先确定分组的个数
        int gap = array.length/2;
        while(gap > 1){
            //调用分组排序
            insertSortGap(array,gap);
            gap = gap/2;
        }

        insertSortGap(array,1);
    }

    private static void insertSortGap(int[] array, int gap) {
        //让bound从第一组的第二个元素开始，让它与第一组的第一个元素进行比较之后，在让第二组的第一个元素与第二个元素进行比较，一次类推
        for (int bound = gap; bound < array.length; bound++) {
            int ret = array[bound];
            //找到当前组的第元素
            int cur = bound-gap;
            for (; cur >= 0; cur -= gap) {
                if (array[cur] > ret){
                    array[cur+gap] = array[cur];
                }else {
                    break;
                }
            }
            array[cur + gap] = ret;

        }
    }


    //性能分析：插入排序
    //(1)时间复杂度：O(n^2)
    //(2)空间复杂度：O(1)
    //(3)稳定性：稳定排序
    //(4)特点：当当前数组元素较少的时候，排序速率较高；当当前元素接近有序的时候，效率较高；
    //(5)优化：折半优化,找合适位置的时候可以折半给ret找一个合适的位置在进行插入

    public static void insertSort(int[] array){
        for (int bound = 1; bound < array.length; bound++) {
            int ret = array[bound];
            int cur = bound-1;
            for (; cur >= 0; cur--) {
                if (array[cur] > ret){
                    array[cur+1] = array[cur];
                }else {
                    break;
                }
            }
            array[cur+1] = ret;
        }

    }



    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
       bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
