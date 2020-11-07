package 队列;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-07
 * Time: 13:58
 **/
public class MyQueueByArray {
    private int[] elem = new int[100];
    private int data;
    private int size;
    private int head = 0;
    private int tail = 0;
    //入队列
    public void offer(int x){
        //判断当前的数组是否已经满了，如果满了就返回
        if (size >= elem.length){
            return;
        }
        //进行插入操作
       elem[tail] = x;
       tail++;
       //如果当前数组已经满了，那么就让尾巴指向队首
       if (tail >= size){
           tail = 0;
       }
       size++;
    }
    public Integer poll(){
        //判断当前队列是否为满
        if (size == 0){
            return null;
        }
        //找到队首元素
        int ret = elem[head];
        head++;
        if (head >= size){
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
