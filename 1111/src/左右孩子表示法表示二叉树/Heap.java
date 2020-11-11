package 左右孩子表示法表示二叉树;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-11
 * Time: 20:50
 **/
public class Heap {
    //向下调整
    //思路：(1)size表示的是堆的有效范围，index表示要调整的位置
    //(2)让parent从index位置开始遍历，先判断当前节点是不是叶子节点，若是直接返回
    //(3)判断当前节点是否有右子树，并比较右子树和左子树的大小，找出右子树和左子树中的最小值
    //(4)若parent的值大于刚刚找到的最小值，则二者交换；
    //(5)交换完毕后，让parent走到child的位置，继续向下比较，知道调整完毕
    public static void shiftDown(int[] array,int size,int index){
        int parentIndex = index;
        int leftChild = (index*2)+1;

        while(true){
            if (leftChild > size){
                break;
            }
            int rightChild = leftChild+1;
            int minIndex = leftChild;
            if (rightChild < size && array[rightChild] < array[leftChild]){
                minIndex = rightChild;
            }
            if (array[parentIndex] > array[minIndex]){
                int tmp = array[parentIndex];
                array[parentIndex] = array[minIndex];
                array[minIndex] = tmp;
            }else {
                break;
            }
            parentIndex = minIndex;
            leftChild = parentIndex*2+1;
        }

    }


    public static void createHeap(int[] array,int size){
        for (int i = (size-1-1)/2; i >= 0 ; i--) {
            shiftDown(array,size,i);
        }
    }

    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        createHeap(array,array.length);
        System.out.println(Arrays.toString(array));
    }
}
