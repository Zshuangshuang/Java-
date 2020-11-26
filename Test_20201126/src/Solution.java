/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-26
 * Time: 23:52
 **/
import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
       stack1.push(node);
    }

    public int pop() {
        Integer ret=null;
        if(!stack2.empty()){
            ret=stack2.pop();
        }else{

            while(!stack1.empty()){
                ret=stack1.pop();
                stack2.push(ret);
            }

            if(!stack2.empty()){
                ret=stack2.pop();
            }
        }
        return ret;
    }

}