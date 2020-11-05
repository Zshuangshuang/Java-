import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-05
 * Time: 16:07
 **/
public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] scoreArr = scanner.nextLine().split(" ");
        int[] score = new int[scoreArr.length];
        int total = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            score[i] = Integer.parseInt(scoreArr[i]);
            total += score[i];
        }
        double avg = total*1.0 /scoreArr.length;
        System.out.printf("%.1f",avg);


    }
}
