import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-07
 * Time: 12:32
 **/
public class 基于栈实现队列 {
    //A负责入队列，B负责出队列
    private Stack<Integer> A = new Stack<>();
    private Stack<Integer> B = new Stack<>();
    //入队列操作
    public void offer(int x){
        //先判断队列是否为空，将B中的元素往A中倒腾，最终将

        while(!B.isEmpty()){
            int tmp = B.pop();
            A.push(tmp);
        }
        A.push(x);

    }
    public Integer poll(){
        if (empty()){
            return null;
        }
        while(!A.isEmpty()){
            int tmp = A.pop();
            B.push(tmp);
        }
        return B.pop();
    }
    public Integer peek(){
        if (empty()){
            return null;
        }
        while(!A.isEmpty()){
            int tmp = A.pop();
            B.push(tmp);
        }
        return B.peek();
    }
    public boolean empty(){
        return A.isEmpty() && B.isEmpty();
    }
}
