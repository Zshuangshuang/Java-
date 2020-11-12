/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-12
 * Time: 16:29
 **/
public class MyPriorityQueue {

    public static int[] array = new int[100];
    public static int size;
    public  void offer(int x){
        array[size] = x;
        size++;
        shiftUp(array,size-1);
    }

    public  int poll(){
        int ret = array[0];
        array[0] = array[size-1];
        size--;
        shiftDown(array,size,0);
        return ret;
    }
    public static int peek(){
        return array[0];
    }
    //向上调整
    private  void shiftUp(int[] array,int index){
        //从数组最后一个元素开始向上调整
        int child = index;
        int parentIndex = (child-1)/2;
        while(child > 0){
            //如果是双亲结点小于子节点，那么就交换
            if (array[parentIndex] < array[child]){
                int tmp = array[parentIndex];
                array[parentIndex] = array[child];
                array[child] = tmp;
            }else {
                break;
            }
            //找到新的孩子节点和双亲结点
            child = parentIndex;
            parentIndex = (child-1)/2;
        }
    }
    public  void shiftDown(int[] array,int size,int index) {

        while (true) {
            int parentIndex = index;
            int leftIndex = index * 2 + 1;
            if (leftIndex > size) {
                break;
            }
            int rightIndex = leftIndex + 1;
            int maxIndex = leftIndex;
            if (maxIndex < size && array[rightIndex] > array[maxIndex]) {
                maxIndex = rightIndex;
            }
            if (array[parentIndex] < array[maxIndex]) {
                int tmp = array[parentIndex];
                array[parentIndex] = array[maxIndex];
                array[maxIndex] = tmp;
            } else {
                break;
            }
            parentIndex = leftIndex;
            leftIndex = leftIndex * 2 + 1;
        }
    }

    public  boolean isEmpty(){
        return size == 0;
    }

    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue();
        myPriorityQueue.offer(9);
        myPriorityQueue.offer(5);
        myPriorityQueue.offer(2);
        myPriorityQueue.offer(7);
        myPriorityQueue.offer(3);
        myPriorityQueue.offer(6);
        myPriorityQueue.offer(8);

        while(!myPriorityQueue.isEmpty()){
            int ret = myPriorityQueue.poll();
            System.out.print(ret+"  ");
        }

    }
}
