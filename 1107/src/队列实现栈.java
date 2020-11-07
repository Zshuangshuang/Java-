import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-07
 * Time: 12:19
 **/
public class 队列实现栈 {
    private Queue<Integer> A = new LinkedList<>();
    private Queue<Integer> B = new LinkedList<>();
    public void push(int x){
        A.offer(x);
    }
    public Integer pop(){
        if (empty()){
            return null;
        }
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
    public Integer top(){
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

    public boolean empty(){
        return A.isEmpty() && B.isEmpty();
    }
}
