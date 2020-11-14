import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-14
 * Time: 11:08
 **/
public class SortDemo {
    //5、堆排序
    //思路:将当前数组建堆（升序排序建大堆，建成小堆在进行向下调整的时候容易不满足对的性质，导致程序无法继续执行下去）
    //取出堆顶元素，和堆的最后一个元素进行交换，并将堆顶元素从堆中删除
    //对堆进行向下调整，直至整个数组有序
    //性能分析：时间复杂度：0(nLogN)  空间复杂度:O(1)    稳定性：不稳定
    public static void heapSort(int[] array){
        createHeap(array);
        for (int i = 0; i < array.length-1; i++) {
            swap(array,0,array.length-1-i);
            shiftDown(array,array.length-1-i,0);
        }
    }

    private static void shiftDown(int[] array, int heapLength, int index) {
        while(true){
            int leftChild = (index*2) + 1;
            //当左孩子节点的下标大于等于堆中元素的个数时候，说明不存在孩子节点，也就是该接待你为叶子节点时候，退出循环
            if (leftChild >= heapLength){
                break;
            }
            int rightChild = leftChild+1;
            int maxIndex = leftChild;
            if (rightChild < heapLength && array[rightChild] > array[maxIndex]){
                maxIndex = rightChild;
            }
            if (array[maxIndex] > array[index]){
                swap(array,maxIndex,index);
            }else {
                break;
            }
            index = leftChild;
            leftChild = index*2+1;
        }
    }

    private static void swap(int[] array, int heapHead, int heapTail) {
        int tmp = array[heapHead];
        array[heapHead] = array[heapTail];
        array[heapTail] = tmp;
    }

    private static void createHeap(int[] array) {
        for (int i = (array.length-1-1)/2; i >= 0; i--) {
            shiftDown(array,array.length,i);
        }
    }


    //4、冒泡排序
    //思路：比较相邻两个元素的大小，如果后面一个元素比前一个元素小，就交换他们的位置；
    //性能分析：时间复杂度：O(n^2)  空间复杂度：O(1)   稳定性：稳定

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }

    }

    //3、选择排序
    //思路：将整个数组分为已排序区间[0.bound),待排序区间：[bound,size)
    //找到整个数组中的最小值找到,放在已排序区间，以此类推进行比较
    //性能分析：
    //时间复杂度：O(n^2)  空间复杂度:O(1)   稳定性：不稳定
    public static void selectSort(int[] array){
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

    //2、希尔排序
    //思路：先将数组分为gap组,分别对这gap组进行插入排序
    //当gap=1的时候，系统进行一次插入排序
    //时间复杂度：O(n^2)，理论值为O(n^1.3)  空间复杂度：O(1)  稳定性：不稳定

    public static void shellSort(int[] array,int gap){
        while(gap > 1){
            insertSortWithGap(array,gap);
            gap = gap/2;
        }
        insertSortWithGap(array,1);

    }

    private static void insertSortWithGap(int[] array, int gap) {
        for (int bound = gap; bound < array.length; bound++) {
            int ret = array[bound];
            int cur = bound-gap;
            for (; cur >= 0; cur -= gap) {
                if (array[cur] > ret){
                    array[cur+gap] = array[cur];
                }else {
                    break;
                }

            }
            array[cur+gap] = ret;
        }
    }

    //1、插入排序
    //时间复杂度：O（n^2)  空间复杂度：O(1)   稳定性:稳定
    //思路：将数组分为已排序区间[0,bound)和待排序区间[bound,size),每次取待排序区间的元素和已排序区间的元素进行比较大小
    //若待排序区间的元素小于已排序区间的元素，那么就用一个变量保存待排序区间的元素，先用已排序区间的元素覆盖待排序区间的元素
    //最终再将该变量插入合适的位置
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
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
