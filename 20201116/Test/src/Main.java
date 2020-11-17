import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-16
 * Time: 20:06
 **/

public class Main{
    public static void main(String[] args) throws IOException {
        /*BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        String year = s.substring(0,4);
        String month = s.substring(4,6);
        String date = s.substring(6,8);
        System.out.println("year="+year);
        System.out.println("month="+month);
        System.out.println("date="+date);*/
        /*BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        String[] ret = s.split(" ");
        int a = Integer.parseInt(ret[0]);
        int b = Integer.parseInt(ret[1]);
        int t = (int)a/b;
        int m = a%b;
        System.out.println(t+" "+m);*/
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String[] ret = str.split(" ");
        double a = Double.parseDouble(ret[0]);
        double b = Double.parseDouble(ret[1]);
        double c = Double.parseDouble(ret[2]);
        double sum = (a+b+c)*1.0;
        double avg = (a+b+c)*1.0/3;
        System.out.printf("%.2f %.2f",sum,avg);
    }
}

