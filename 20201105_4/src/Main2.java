import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-05
 * Time: 15:22
 **/
public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double v = (3*3.14*r*r*r)/4;
        System.out.printf("%.3f",v);
    }
}
