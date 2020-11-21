import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-21
 * Time: 12:01
 **/
public class Main {

    public static void main(String[] args) throws IOException {
        /*//针对每行输入，输出用“*”组成的对应长度的翻转直角三角形，每个“*”后面有一个空格
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            for (int row = 0; row < n; row++) {
                for (int i = 0; i <= row; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }*/
        /*Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            for (int row = 0; row < n; row++) {
                for (int i = 0; i < n-row-1; i++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= row; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }*/
        /*System.out.println("Happy New Year*2019*");*/
        /*BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        String[] ret = s.split(" ");
        double a0 = Double.parseDouble(ret[0]);
        double a1 = Double.parseDouble(ret[1]);
        double a2 = Double.parseDouble(ret[2]);
        double a3 = Double.parseDouble(ret[3]);
        double a4 = Double.parseDouble(ret[4]);
        double avg = 0;
        avg = (a0+a1+a2+a3+a4)/5;
        System.out.printf("%.2f",avg);*/
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int val = scanner.nextInt();
            switch (val){
                case(200):
                    System.out.println("OK");
                    break;
                case(202):
                    System.out.println("Accepted");
                    break;
                case(400):
                    System.out.println("Bad Request");
                    break;
                case(403):
                    System.out.println("Forbidden");
                    break;
                case(404):
                    System.out.println("Not Found");
                    break;
                case(500):
                    System.out.println("Internal Server Error");
                    break;
                case(502):
                    System.out.println("Bad Gateway");
                default:
                    System.out.println("请输入正确的数字");
                    break;
            }

        }
    }
}
