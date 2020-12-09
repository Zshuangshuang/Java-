import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-09
 * Time: 21:40
 **/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
            int score = scanner.nextInt();
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == score){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

