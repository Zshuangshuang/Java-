import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:括号匹配问题
 * User: 14342
 * Date: 2020-11-06
 * Time: 18:18
 **/
public class Test {
    public boolean isEquals(String s){
        //床见一个栈的集合
        Stack<Character> stack = new Stack<>();
        //循环取出每个字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //判断当前字符是不是左括号
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
                continue;
            }
            //如果当前栈为空栈，则证明没有左括号，直接返回false
            if (stack.empty()){
                return false;
            }
            //取栈顶元素
            char top = stack.pop();
            //判断阔好是否匹配
           if (top == '(' && c == ')'){
               continue;
           }
           if (top == '[' && c == ']'){
               continue;
           }
           if (top == '{' && c == '}'){
               continue;
           }
           return  false;

        }
        //如果当前括号均匹配，那么此时栈应该是空的
        if (stack.empty()){
            return true;
        }
        return false;
    }
}
