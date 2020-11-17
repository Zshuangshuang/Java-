import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-17
 * Time: 13:39
 **/
public class Main {

    public static void main(String[] args)throws IOException {
        /*BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        String[] ret = s.split(" ");
        int height = Integer.parseInt(ret[0]);
        int weight = Integer.parseInt(ret[1]);
        double bim = weight*1.0/(height*height);
        System.out.printf("%.2f",bim);*/
        /*BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        String[] ret = s.split(" ");*/
       /* double a = Double.parseDouble(ret[0]);
        double b = Double.parseDouble(ret[1]);
        double c = Double.parseDouble(ret[2]);
        double circumference = a+b+c;
        double p = (a+b+c)/2;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.print(String.format("circumference=%.2f area=%.2f",circumference,area));*/
       /* BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ret = null;
        while((ret = bf.readLine() )!= null){
            System.out.println(ret.toLowerCase());*/
        /*Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(1<<n);*/
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        String[] ret = s.split(" ");
        int a = Integer.valueOf(ret[0].substring(2),16);
        int b = Integer.valueOf(ret[1],8);
        System.out.println(a+b);
        }

    }

