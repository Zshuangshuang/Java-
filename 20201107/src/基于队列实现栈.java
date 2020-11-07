import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-07
 * Time: 14:10
 **/
public class 基于队列实现栈 {
    private Queue<Integer> A = new LinkedList<>();
    private Queue<Integer> B = new LinkedList<>();
    //入栈
    public void push(int x){
        A.offer(x);
    }
    //出栈
    public Integer pop(){
        if (empty()){
            return null;
        }
        while(A.size() > 1){
            int tmp = A.poll();
            B.offer(tmp);
        }
        int ret = A.poll();
        swap();
        return ret;
    }
    public Integer peek(){
        if (empty()){
            return null;
        }
        while (A.size() > 1){
            int tmp = A.poll();
            B.offer(tmp);
        }
        int ret = A.poll();
        B.offer(ret);
        swap();
        return ret;
    }

    private void swap() {
        Queue<Integer> tmp = new LinkedList<>();
        tmp = A;
        A = B;
        B = tmp;
    }

    public boolean empty(){
        return A.isEmpty() && B.isEmpty();
    }
}
