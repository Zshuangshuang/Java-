import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-28
 * Time: 22:13
 **/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            int a;
            while(n > 0){
                a = n%6;
                list.add(a);
                n = n/6;
            }
            for (int i = list.size()-1; i >= 0; i--) {
                System.out.print(list.get(i)+" ");
            }
        }
    }
}*/
