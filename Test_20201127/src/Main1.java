import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-27
 * Time: 18:51
 **/
public class Main1 {
    public static void main(String[] args) {
        boolean b = true?false:true == true?false:true;
        System.out.println(b);

    }
}
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int num = Integer.parseInt(str1);
        String[] score = str2.split(" ");
        double[] grade = new double[score.length];
        double sum = 0.0;
        for (int i = 0; i < score.length; i++) {
            grade[i] = Double.parseDouble(score[i]);
        }
        for (double x:grade){
            sum += x;
        }
        double avg = sum/grade.length;
        Arrays.sort(grade);
        double minScore = grade[0];
        double maxScore = grade[grade.length-1];
        System.out.println(String.format("%.2f %.2f %.2f",maxScore,minScore,avg));

    }
}*/
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int eveOfCount = 0;
        int oldOfCount = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                oldOfCount++;
            }else {
                eveOfCount++;
            }
        }
        System.out.println(eveOfCount+" "+oldOfCount);
    }
}*/

 /* *//*  public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 2019 ; i++) {
           int ret = i;
           while(ret > 0){
               if (ret % 10 == 9){
                   count++;
                   break;
               }
               ret = ret /10;
           }
        }
        System.out.println(count);
    }*//*
}
*/