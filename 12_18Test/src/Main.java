import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-08
 * Time: 19:57
 **/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while (n != 0 && count <= 300000) {
            n = ((n << 1) + 1) % 1000000007;
            count++;
        }
        count = (count+2)/3;
        System.out.println(count >100000 ? -1 : count);
    }
}
