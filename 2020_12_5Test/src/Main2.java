import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-05
 * Time: 16:53
 **/

public class Main2 {
    public static List<Integer> add(int[] array,int n,int toRemove){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (array[i] != toRemove){
                list.add(array[i]);
            }
        }
        return list;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        if (n >= 3 && n <= 100){
            String[] ret = bufferedReader.readLine().split(" ");
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(ret[i]);
            }
            int toRemove = Integer.parseInt(bufferedReader.readLine());
            List<Integer> list = new ArrayList<>();
            list = add(array,n,toRemove);
            System.out.println(list.size());
            for (int x:list){
                System.out.print(x+" ");
            }
        }
    }
}