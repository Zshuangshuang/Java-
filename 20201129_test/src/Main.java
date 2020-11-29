import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-29
 * Time: 22:11
 **/
public class Main {
    public static int max(int a,int b){
        int c = a%b;
        while(c != 0){
            a = b;
            b = c;
            c = a%b;
        }
        return b;
    }
    public static int min(int a,int b){
        int c = max(a,b);
        int ret = (a*b)/c;
        return ret;
    }

    //两个数的最大公约数×最小公倍数=两个数的乘积
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(min(a, b));
        }
    }
}
    /*public static int delPutCake(int row,int col){
        int ret = 0;
        if (row%4 == 0 || col %4 == 0){
            ret = (row*col)/2;
        }else {
            ret = (row*col)/2+1;
        }
        return ret;
    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int row = scanner.nextInt();
       int col = scanner.nextInt();
       int num = delPutCake(row,col);
        System.out.println(num);
    }
}
*/