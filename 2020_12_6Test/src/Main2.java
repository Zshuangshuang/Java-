import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-06
 * Time: 23:46
 **/
public class Main2 {
    public static void print(String c,int n,int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == row){
                    System.out.print(c);
                }else {
                    if (j == 1 || j == row-2){
                        System.out.print(c);
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        //读入数字n和字符，判断n是否合法
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            String c = scanner.next();
            int row = 0;
            if (n >= 3 || n <= 20){
                if (n%2 == 0){
                    row = n/2;
                    print(c,n,row);
                }else {
                    row = n/2 +1;
                    print(c,n,row);
                }
            }
        }
    }
}
