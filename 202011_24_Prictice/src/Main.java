import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-24
 * Time: 23:40
 **/
public class Main {

    public class Parenthesis {
        private boolean isPerfect(String s){
           Stack<Character> stack = new Stack<>();
           Map<Character,Character> map = new HashMap<>();
           map.put('(',')');
           map.put('[',']');
           map.put('{','}');
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '(' || ch == '[' || ch == '{'){
                    stack.push(ch);
                    continue;
                }
                if (stack.empty()){
                    return false;
                }
                Character top = stack.pop();
                if (map.get(top) ==ch){
                    continue;
                }

            }
            if (stack.empty()){
                return true;
            }
            return false;
        }
        public boolean chkParenthesis(String A, int n) {
            if (n <= 0 || n%2 != 0){
                return false;
            }
            return isPerfect(A);
        }
    }
    //输入最长数字串
    //思路：（1）将输入的字符串用"a"分割开
    //(2)找到数字串的最大值
    //(3)打印数字串
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String str1 = "";
        String str2 = "a";
        for (char ch:s.toCharArray()) {
            if (ch >='0' && ch <= '9'){
                str1 += ch;
            }else {
                str1 += str2;
            }
        }
        String[] tmp = str1.split(str2);
        int max = 0;
        for (int i = 0; i < tmp.length; i++) {
                max = Math.max(max,tmp[i].length());
        }
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i].length() == max){
                System.out.println(tmp[i]);
            }
        }
    }*/
}
