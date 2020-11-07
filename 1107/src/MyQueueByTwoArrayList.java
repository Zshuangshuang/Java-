/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-07
 * Time: 12:12
 **/
public class MyQueueByTwoArrayList {
    public int[] elem = new int[100];
    public int size;
    public int head = 0;
    public int tail = 0;
    public int data;

    public MyQueueByTwoArrayList(int data) {
        this.elem = elem;
        this.size = size;
        this.head = head;
        this.tail = tail;
        this.data = data;
    }
    public void offer(int data){
        if (tail >= elem.length){
            return;
        }
        elem[tail] = data;
        tail++;
        if (tail >= elem.length){
            tail = 0;
        }
        size++;

    }
    public Integer poll(){
        if (size == 0){
            return null;
        }
        int ret = elem[head];
        head++;
        if (head >= elem.length){
            head = 0;
        }
        size--;
        return ret;
    }
    public Integer peek(){
        if (size == 0){
            return null;
        }
        return elem[head];
    }
}
