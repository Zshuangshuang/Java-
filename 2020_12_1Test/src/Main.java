import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-01
 * Time: 23:30
 **/
public class Main {
    public static char[] reverse(int num){
        String str = String.valueOf(num);
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while(left < right){
            char tmp = ch[left];
            ch[left] = ch[right];
            ch[right] = tmp;
            left++;
            right--;
        }
       return ch;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
           char[] ch =  reverse(n);
            for (int i = 0; i < ch.length; i++) {
                System.out.print(ch[i]);
            }
        }

    }
}
