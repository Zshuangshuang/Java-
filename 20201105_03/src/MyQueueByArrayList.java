/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-05
 * Time: 12:21
 **/
public class MyQueueByArrayList {

    public int[] array = new int[100];
    public int head = 0;
    public int tail = 0;
    public int size = 0;
    public void offer(int val){
        if (tail >= array.length){
            return;
        }
        array[tail] = val;
        tail++;
        if (tail >= array.length){
            tail = 0;
        }
        size++;
    }
    public Integer poll(){
        if (size == 0){
            return null;
        }
        Integer ret = array[head];
        head++;
        if (head >= array.length){
            head = 0;
        }
        size--;
        return ret;
    }
    public Integer peek(){
        if (size == 0){
            return null;
        }
        return array[head];
    }

}
