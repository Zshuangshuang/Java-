import java.nio.charset.StandardCharsets;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-07
 * Time: 14:21
 **/
public class 最小栈 {
    private Stack<Integer> A = new Stack<>();
    private Stack<Integer> B = new Stack<>();
    public void push(int x){
        A.push(x);
        if (B.empty()){
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
        if (A.empty()){
            return null;
        }
        B.pop();
        return A.pop();
    }
    public Integer peek(){
        if (A.empty()){
            return null;
        }
        return A.peek();
    }
    public Integer getMin(){
        if (B.empty()){
            return null;
        }
        return B.peek();
    }
}
