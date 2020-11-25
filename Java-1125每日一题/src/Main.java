import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-25
 * Time: 19:23
 **/

public class Main {
    //删除第一个字符串中的第二个字符串出现的内容
    //思路：采用list，判断第二个字符是否包含第一个字符i位置的元素，如果不包含，那么就把它添加到list中去，最终遍历list即可
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if (str1 == "" || str2 == "") {
            return;
        }
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            if (!(str2.contains(str1.charAt(i) + " "))) {
                list.add(str1.charAt(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
   /* public static int buyApple(int n){
        if (n%2 != 0 || n == 10 || n < 6){
            return -1;
        }
        if (n % 8 == 0){
            return n/8;
        }
        return n/8+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 100){
            System.out.println(buyApple(n));
        }
    }*//*
}
*/