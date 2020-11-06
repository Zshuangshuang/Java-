import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-06
 * Time: 19:08
 **/
public class 用队列实现栈 {
Queue<Integer> A = new LinkedList<>();
Queue<Integer> B = new LinkedList<>();
public void offer(int x){
    A.offer(x);

}
public Integer poll(){
    //判断是否为空
    if (empty()){
        return null;
    }
    //让A中的元素出栈，往B中入队列.让A始终负责插入元素，B始终负责出队列
    while(A.size() > 1){
        int front = A.poll();
        B.offer(front);

    }
    int ret = A.poll();
    swap();
    return ret;

}

    private void swap() {
    Queue<Integer> tmp = new LinkedList<>();
    tmp = A;
    A = B;
    B = tmp;
    }
    public Integer top (){
    if (empty()){
        return null;
    }
    while(A.size() > 1){
        int front = A.poll();
        B.offer(front);
    }
    int ret = A.poll();
    B.offer(ret);
    swap();
    return ret;
    }

    private boolean empty() {
    return A.isEmpty() && B.isEmpty();
    }

}
