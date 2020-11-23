import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:回文串”是一个正读和反读都一样的字符串，
 *比如“level”或者“noon”等等就是回文串。花花非常喜欢这种拥有对称美的回文串，
 * 生日的时候她得到两个礼物分别是字符串A和字符串B。现在她非常好奇有没有办法将字符串B插入字符串A使产生的字符串是一个回文串。
 * 你接受花花的请求，帮助她寻找有多少种插入办法可以使新串是一个回文串。如果字符串B插入的位置不同就考虑为不一样的办法。
 * User: 14342
 * Date: 2020-11-22
 * Time: 20:53
 **/
public class Main {
    //写一个静态方法判断字符穿是否为回文结构
        public static boolean isRecycleWords(String s){
            int left = 0;
            int right = s.length()-1;
            //定义左右下标，判断左右下标的内容是否相同，从而判断是否为回文结构
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
            int count = 0;
            //将str2中的字符插入str1，判断是否为回文结构
        for (int i = 0; i <str1.length(); i++) {
            StringBuilder str = new StringBuilder(str1);
            str.insert(i,str2);
            boolean ret = isRecycleWords(str.toString());
            if (ret){
                count++;
            }
        }
        System.out.println(count);

    }
}
