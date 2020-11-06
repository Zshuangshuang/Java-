import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-06
 * Time: 19:01
 **/
public class 用map判断括号是否匹配 {
    public boolean isEquals(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
                continue;
            }
            if (stack.empty()){
                continue;
            }
            char top = stack.pop();
            if (map.get(top) == c){
                continue;
            }
            return false;
        }
        if (stack.empty()){
            return true;
        }
        return false;

    }
}
