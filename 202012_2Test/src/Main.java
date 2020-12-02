import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-02
 * Time: 19:30
 **/
public class Main {
    public static int minFab(int n){
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        while(f2 < n){
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        if (Math.abs(f2-n) > Math.abs(f1-n)){
            return Math.abs(f1-n);
        }
        return Math.abs(f2-n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int ret = minFab(n);
            System.out.println(ret);
        }
    }
}
