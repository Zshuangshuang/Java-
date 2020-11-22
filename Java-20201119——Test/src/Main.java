import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-19
 * Time: 17:18
 **/
public class Main {

    public static void main(String[] args) throws IOException {
        //输入：目有多组输入数据，每一行输入两个整数（范围（1 ~231-1），用空格分隔。
        //输出：针对每行输入，输出两个整数及其大小关系，数字和关系运算符之间没有空格
       /* BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        String[] ret = s.split(" ");
        int a = Integer.parseInt(ret[0]);
        int b = Integer.parseInt(ret[1]);
        if (a > b){
            System.out.println(a+">"+b);
        }else if (a < b){
            System.out.println(a+"<"+b);
        }else {
            System.out.println(a+"="+b);
        }*/
        /*Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int num = scanner.nextInt();
            if (num < 0){
                System.out.println(0);
            }
            if (num == 0){
                System.out.println(0.5);
            }
            if (num > 0){
                System.out.println(1);
            }
        }*/
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while((s = bf.readLine()) != null){
            String[] ret = s.split(" ");
            int a = Integer.parseInt(ret[0]);
            int b = Integer.parseInt(ret[1]);
            int c = Integer.parseInt(ret[2]);
            if (a+b > c && a+c > b && b+c > a){
                if (a == b && b==c){
                    System.out.println("Equilateral triangle!");
                }else if(a == b || b == c || a == b){
                    System.out.println("Isosceles triangle!");
                }else{
                    System.out.println("Ordinary triangle!");
                }

            }else{
                System.out.println("Not a triangle!");
            }
        }
    }
}
