import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-05
 * Time: 16:37
 **/
public class Main1 {
    public static List<Integer> avoidCh(int[] array,int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!list.contains(array[i])){
                list.add(array[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.nextLine());
        if (n == null){
            return;
        }
        String[] str = scanner.nextLine().split(" ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        List<Integer> list = new ArrayList<>();
        list = avoidCh(array,n);
        Collections.sort(list);
        for (int x:list){
            System.out.print(x+" ");
        }
    }
}

