import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:大堆
 * User: 14342
 * Date: 2020-11-12
 * Time: 16:04
 **/
public class HeapDemo {
    public static void shiftDown(int[] array,int size,int index){

        while(true){
            int parentIndex = index;
            int leftIndex = index*2+1;
            if (leftIndex > size){
                break;
            }
            int rightIndex = leftIndex+1;
            int maxIndex = leftIndex;
            if (maxIndex < size && array[rightIndex] > array[maxIndex]){
                maxIndex = rightIndex;
            }
            if (array[parentIndex] < array[maxIndex]){
                int tmp = array[parentIndex];
                array[parentIndex] = array[maxIndex];
                array[maxIndex] = tmp;
            }else {
                break;
            }
            parentIndex = leftIndex;
            leftIndex = leftIndex*2+1;
        }

    }
    public static void createHeap(int[] array,int size){
        for (int i = (size-1-1)/2; i >= 0; i--) {
            shiftDown(array,size,i);
        }
    }

    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        createHeap(array,array.length);
        System.out.println(Arrays.toString(array));
    }
}
