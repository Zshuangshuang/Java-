import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-11
 * Time: 19:47
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int size = scanner.nextInt();
        int lengthOfString = str.length();
        int[] count = new int[lengthOfString-size];
        int max = 0;
        for (int i = 0; i < lengthOfString-size; i++) {
            String stub = str.substring(i,i+size);
            for (int j = 0; j < size; j++) {
                if (stub.charAt(j) == 'C' || stub.charAt(j) == ('G')){
                    count[i]++;
                }
            }
            if (count[max] < count[i] ){
                max = i;
            }
        }
        String res=str.substring(max,max+size);
        System.out.println(res);
    }
}
