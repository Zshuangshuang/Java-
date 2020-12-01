import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-01
 * Time: 22:49
 **/
public class Main2 {
    public static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }

   public static int numsOf10(int n){
       List<Character> list = new ArrayList<>();
        String str = String.valueOf(n);
       for (int i = 0; i < str.length(); i++) {
           char c = str.charAt(i);
           if (c == '0'){
               list.add(c);
           }
       }

        return list.size();
   }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n >= 1 && n <= 1000){
                int ret = fac(n);
                int count = numsOf10(ret);
                System.out.println(count);
            }

        }

    }
}



