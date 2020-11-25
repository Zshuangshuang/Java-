/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-25
 * Time: 20:47
 **/
public class Finder {

    public static void qSort(int[] array){
        qSortHelper(array,0,array.length-1);

    }
    public static void qSortHelper(int[] array,int lowIndex,int highIndex){
        //size表示待排序区间的元素个数
        int size = highIndex-lowIndex+1;
        //待排序区间只有一个元素或者没有元素的时候就是递归结束的条件
        if (size <= 1){
            return;
        }
        //基准元素的位置
        int keyIndex = partition(array,lowIndex,highIndex);
        //递归给基准元素左侧的元素排序
        qSortHelper(array,lowIndex,keyIndex-1);
        //递归对右边的元素进行排序
        qSortHelper(array,keyIndex+1,highIndex);
    }
    public static int partition(int[] array,int lowIndex,int highIndex){
        //定义左右两个下标
        int leftIndex = lowIndex;
        int rightIndex = highIndex;
        int key = array[lowIndex];
        while(leftIndex < rightIndex){
            //从右边开始找，找到第一个比基准key值小的元素
            while(leftIndex < rightIndex && array[rightIndex] <= key){
                rightIndex--;
            }
            //从左边开始寻找，找到第一个比key基准值大的元素
            while(leftIndex < rightIndex && array[leftIndex] >= key){
                leftIndex++;
            }
            //交换两个元素的位置
            swap(array,leftIndex,rightIndex);
        }
        //最终leftIndex == rightIndex,交换leftIndex和基准元素的位置，返回leftIndex也就是基准值key的位置即可
        swap(array,leftIndex,lowIndex);
        return leftIndex;
    }
    public static void swap(int[] array,int x,int y){
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }
    public static int findKth(int[] a, int n, int K) {

        if (K > n){
            return -1;
        }
        if (n == 0){
            return-1;
        }

        qSort(a);
        return a[K-1];
    }
}
