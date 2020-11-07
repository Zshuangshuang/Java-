import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-07
 * Time: 14:16
 **/
public class 基于栈实现队列 {

    private Stack<Integer> A = new Stack<>();
    private Stack<Integer> B = new Stack<>();
    public void offer(int x){
        if (B.isEmpty()){
            int tmp = B.pop();
            A.push(tmp);
        }
        A.push(x);
    }
    public Integer poll(){
        if (isEmpty()){
            return null;
        }
        while(!B.empty()){
            int tmp = B.pop();
            A.push(tmp);
        }
        return B.pop();
    }
    public Integer peek(){
        if (isEmpty()){
            return null;
        }
        while(!B.empty()){
            int tmp = B.pop();
            A.push(tmp);
        }
        return B.peek();
    }
    public boolean isEmpty(){
        return A.empty() && B.empty();
    }
}
