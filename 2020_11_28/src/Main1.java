import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-28
 * Time: 21:00
 **/
public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ret = scanner.nextLine().split(" ");
        int row = Integer.parseInt(ret[0]);
        int col = Integer.parseInt(ret[1]);
        String[] strings = scanner.nextLine().split(" ");
        int index = 0;
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(strings[index]);
                System.out.print(arr[i][j]+" ");
                index++;
            }
            System.out.println();
        }

    }
}
/*//一个n行m列的矩阵，求第x行第y列的值是多少，
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ret = scanner.nextLine().split(" ");
        int row = Integer.parseInt(ret[0]);
        int col = Integer.parseInt(ret[1]);
        String[][] s = new String[row][col];
        int[][] tmp = new int[row][col];
        for (int i = 0; i < row; i++) {
            s[i] = scanner.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                tmp[i][j] = Integer.parseInt(s[i][j]);
            }
        }
        String[] find = scanner.nextLine().split(" ");
        int row1 = Integer.parseInt(find[0]);
        int col1 = Integer.parseInt(find[1]);
        System.out.println(tmp[row1-1][col1-1]);
    }
}*/
   /* public static void main(String[] args) {
        //输入：五行，每行输入一个学生各5科成绩（浮点数表示，范围0.0~100.0），用空格分隔。
        //输出：五行，按照输入顺序每行输出一个学生的5科成绩及总分（小数点保留1位），用空格分隔。
      Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            double sum = 0.0;
            String[] scores = scanner.nextLine().split(" ");
            double[] grades = new double[scores.length];
            for (int j = 0; j < scores.length; j++) {
                grades[j] = Double.parseDouble(scores[j]);
                sum += grades[j];
                System.out.printf("%.1f",grades[j]);
                System.out.print(" ");
            }
            System.out.printf("%.1f",sum);
            System.out.print(" ");
        }
    }
}*/