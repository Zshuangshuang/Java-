import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:小堆
 * User: 14342
 * Date: 2020-11-12
 * Time: 15:41
 **/
public class TestHeap {
    public static void shiftDown(int[] array,int size,int index){

      while(true){
          int parentIndex = index;
          int leftIndex = index*2+1;
          if (leftIndex > size){
                break;
          }
          int rightIndex = leftIndex+1;
          int minIndex = leftIndex;
          if (rightIndex < size && array[rightIndex] < array[leftIndex]){
              minIndex = rightIndex;
          }
          if (array[parentIndex] > array[minIndex]){
              int tmp = array[parentIndex];
              array[parentIndex] = array[minIndex];
              array[minIndex] = tmp;
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
        int[] array = {2,1,4,5,6,7};
        createHeap(array,array.length);
        System.out.println(Arrays.toString(array));
    }

}
