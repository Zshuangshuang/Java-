import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-07
 * Time: 12:06
 **/
public class 括号匹配问题 {

    public boolean isEquals(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c  =s.charAt(i);
            if (c == '{' || c == '[' || c == '('){
                stack.push(c);
                continue;
            }
            if (stack.empty()){
                return  false;
            }
            char top = stack.pop();
            if (top == '(' && c == ')'){
                continue;
            }
            if (top == '{' && c == '}'){
                continue;
            }
            if (top == '[' && c == ']'){
                continue;
            }
            return false;
        }
        if (stack.empty()){
            return  true;
        }
        return false;
    }
}
