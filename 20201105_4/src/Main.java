import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-05
 * Time: 15:10
 **/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long age = scanner.nextLong();
        long s = 31560000;
        if (age > 0 && age < 200){
            age = age*s;
            System.out.println(age);
        }else {
            System.out.println("数值越界");
        }
    }
}
