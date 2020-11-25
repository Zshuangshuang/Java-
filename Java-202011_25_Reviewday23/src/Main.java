import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:计算一个字符串中加入一个字符能组成会问结构的次数
 * User: 14342
 * Date: 2020-11-25
 * Time: 18:37
 **/
public class Main {
    //定义左右指针判断是否为回文结构
    public static boolean isRecycle(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int count  = 0;

        for (int i = 0; i < str1.length(); i++) {
            StringBuilder str = new StringBuilder(str1);
            str.insert(i,str2);
            if (isRecycle(str.toString())){
                count++;
            }
        }

        System.out.println(count);
    }

}
