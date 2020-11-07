import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-07
 * Time: 13:09
 **/
public class 最小栈 {

    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();
    public void push(int x){
        A.push(x);
        if (B.isEmpty()){
            B.push(x);
            return;
        }
        int min = B.peek();
        if (x < min){
            min = x;
        }
        B.push(min);
    }
    public Integer pop(){
        if (A.isEmpty()){
            return null;
        }
        B.pop();
        return A.pop();
    }
    public Integer peek(){
        return A.peek();
    }
    public Integer getMin(){
        if (B.isEmpty()){
            return null;
        }
        return B.peek();
    }
}
