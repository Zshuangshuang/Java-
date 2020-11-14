import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:快速排序
 * User: 14342
 * Date: 2020-11-14
 * Time: 14:38
 **/
public class TestDemo {
    //基本思想：(1)构建一个辅助方法，将数组分为[0,小于基准元素]，[大于基准元素，array.length]三个部分，递归对左边和右边区间的元素进行快速排序；
    //(2)写一个方法负责找到基准位置的位置：左右下标寻找法找到当前基准值的位置

    public static void qSort(int[] array){
        qSortHelper(array,0,array.length-1);

    }
    //[lowIndex,keyIndex-1]表示小于基准值的区间，[keyIndex+1,highIndex]表示大于基准值的区间
    private static void qSortHelper(int[] array, int lowIndex, int highIndex) {
        int size = highIndex-lowIndex+1;
        if (size <= 1){
            return;
        }
        int keyIndex = partition(array,lowIndex,highIndex);
        qSortHelper(array,lowIndex,keyIndex-1);
        qSortHelper(array,keyIndex+1,highIndex);
    }

    private static int partition(int[] array, int lowIndex, int highIndex) {
        return partitionPotholing(array,lowIndex,highIndex);
    }
    private static void swap(int[] array,int i,int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    private static int partitionPotholing(int[] array,int lowIndex,int highIndex){
        int leftIndex = lowIndex;
        int rightIndex = highIndex;
        int key = array[lowIndex];
        while(leftIndex < rightIndex){
            while(leftIndex < rightIndex && array[rightIndex] >= key){
                rightIndex--;
            }
            array[leftIndex] = array[rightIndex];
            while((leftIndex < rightIndex) && (array[leftIndex] <= key)){
                leftIndex++;
            }
           array[rightIndex] = array[leftIndex];
        }
        array[leftIndex] = key;
        return leftIndex;
    }
    private static int partitionHover(int[] array,int lowIndex,int highIndex){
        int leftIndex = lowIndex;
        int rightIndex = highIndex;
        int key = array[lowIndex];
        while(leftIndex < rightIndex){
            //因为选取左边的数字作为基准元素，所以要从右边开始进行比较
            //找到第一个比key小的元素
            while(leftIndex < rightIndex && array[rightIndex] >= key){
                rightIndex--;
            }
            //找到第一个比key大的元素
            while((leftIndex < rightIndex) && (array[leftIndex] <= key)){
                leftIndex++;
            }
            //交换两个元素的位置，使得小于key的元素位于左边，大于key的元素放到右边
            swap(array,leftIndex,rightIndex);
        }
        //让基准元素找到c位
        swap(array,lowIndex,leftIndex);
        return leftIndex;
    }

    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        qSort(array);
        System.out.println(Arrays.toString(array));
    }

}
