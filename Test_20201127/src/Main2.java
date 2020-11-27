import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-27
 * Time: 19:28
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] ret = str.split(" ");
        int[] array = new int[ret.length];
        for (int i = 0; i < ret.length; i++) {
            array[i] = Integer.parseInt(ret[i]);
        }
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]){
                     count++;
                }
            }
            map.put(array[i],count);
        }
        Set<Integer> set = map.keySet();
        for (int key:set){
            if (map.get(key) >= array.length/2){
                System.out.println(key);
            }
        }
    }
}
