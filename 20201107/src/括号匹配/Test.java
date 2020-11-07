package 括号匹配;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-07
 * Time: 14:05
 **/
public class Test {
    public boolean isEquals(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '['){
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()){
                return false;
            }
            int top = stack.pop();
            if (map.get(top) == c){
                continue;
            }
            return false;
        }
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }
}
