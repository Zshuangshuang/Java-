import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:给定秒数seconds (0< seconds < 100,000,000)，把秒转化成小时、分钟和秒
 * User: 14342
 * Date: 2020-11-05
 * Time: 15:15
 **/
public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long time = scanner.nextLong();
        if (time > 0 && time < 10000000){
            int h = (int) time/3600;
            time = time%3600;
            int m = (int) time/60;
            time = time%60;
            System.out.println(h+" "+m+" "+time);
        }else {
            System.out.println("越界");
            return;
        }


    }
}
