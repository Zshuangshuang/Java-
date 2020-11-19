import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-19
 * Time: 14:36
 **/
public class Main {

    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String[] ret = s.split(" ");
        double actualPrice = Double.parseDouble(ret[0]);
        int month = Integer.parseInt(ret[1]);
        int day = Integer.parseInt(ret[2]);
        int luck = Integer.parseInt(ret[3]);
        double realPrice = 0.0;
        if (month == 11 && day == 11 && luck == 1){
            realPrice = actualPrice*0.7 - 50;
        }else if (month == 11 && day == 11 && luck == 0){
            realPrice = actualPrice*0.7;
        }else if (month == 12 && day == 12 && luck == 1){
            realPrice = actualPrice*0.8 - 50;
        }else if (month == 12 && day == 12 && luck == 0){
            realPrice = actualPrice*0.8;
        }else {
            realPrice = actualPrice;
        }
        if (realPrice <= 0){
            System.out.println("0.0");
        }else {
            System.out.println(String.format("%.2f",realPrice));
        }*/
        //变种水仙花数 - Lily Number：把任意的数字，从中间拆分成两个数字，
        // 如果所有拆分后的乘积之和等于自身，则是一个Lily Number

        /*for (int i = 10000; i < 99999; i++) {
            int a = (i/10000)*(i%10000);
            int b = (i/1000)*(i%1000);
            int c = (i/100)*(i%100);
            int d = (i/10)*(i%10);
            int sum = a+b+c+d;
            if (i == sum){
                System.out.println(i+"  ");
            }
        }*/
        //两行，第一行输入一个整数，表示n个学生（>=5），第二行输入n个学生成绩（整数表示，范围0~100），用空格分隔。
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //先将字符分割，找到学生个数n和学生成绩
        String s1 = bufferedReader.readLine();
        //找到学生人数n
        int n = Integer.parseInt(s1);
        String s2 = bufferedReader.readLine();
        //找到学生成绩
        String[] ret = s2.split(" ");
        int[] score = new int[ret.length];
        //将学生成绩装入成绩数组
        for (int i = 0; i < ret.length; i++) {
            score[i] = Integer.parseInt(ret[i]);
        }
        //给学生成绩排序:这里采用冒泡排序
        for (int i = 0; i < score.length-1; i++) {
            boolean flg = false;
            for (int j = 0; j < score.length-1-i; j++) {
                if (score[j+1] < score[j]){
                    int tmp = score[j+1];
                    score[i+1] = score[j];
                    score[j] = tmp;
                    flg = true;
                }
            }
            if (!flg){
                break;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(score[i]+" ");
        }*/
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();*/
        /*char[] c = s.toCharArray();
        int x = 0;
        int y = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'A'){
                x++;
            }
            if (c[i] == 'B'){
                y++;
            }
        }
        if (x > y){
            System.out.println("A");
        }else if (x < y){
            System.out.println("B");
        }else {
            System.out.println("E");
        }*/
        /*Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            if (num >= 140){
                System.out.println("Genius");
            }
        }*/
        /*Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            if (num %2 == 0){
                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }
        }*/
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.next();
            char c = s.charAt(0);
            if (c == 'A' || c == 'a' || c == 'E'|| c == 'e'|| c == 'I' || c == 'i'|| c== 'O'|| c == 'o'|| c == 'U' || c == 'u'){
                System.out.println("Vowel");
            }else {
                System.out.println("Consonant");
            }
        }
    }
}
