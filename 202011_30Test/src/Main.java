import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-30
 * Time: 18:33
 **/
public class Main {
    
}
    /*public static int stage(int n){
        int n0 = 0;
        int n1 = 1;
        int n2 = 2;
        int n3 = 0;
        for (int i = 3; i <= n; i++) {
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }
        return n2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = stage(n);
        System.out.println(ret);
    }
}*/
    /*public static long  minGongBeiShu(long n1,long n2){
        long  mul = n1*n2;
        long  ret = maxGongYueShu(n1,n2);
        return mul/ret;
    }
    public static long maxGongYueShu(long n1,long n2){
        long  a = n1;
        long  b = n2;
        long  c = a%b;
        while(c != 0){
            a = b;
            b = c;
            c = a%b;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        long n1 = Long.parseLong(str[0]);
        long n2 = Long.parseLong(str[1]);
        System.out.println(maxGongYueShu(n1,n2)+minGongBeiShu(n1,n2));
    }
}
*/
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int time = n/12*4+2;
        System.out.println(time);
    }
}
*/