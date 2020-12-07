import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-07
 * Time: 19:47
 **/
public class Main1 {
    public static String minNum(int[] array){
       String str = "";
        for (int i = 1; i < 10; i++) {
            if (array[i] != 0){
                str += i;
                array[i]--;
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            while(array[i] != 0){
                str += i;
                array[i]--;
            }
        }
       return str;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ret = scanner.nextLine().split(" ");
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(ret[i]);
        }
        System.out.println(minNum(array).toString());
    }
}
