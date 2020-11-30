import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:3 9 6 8 -10 7 -11 19 30 12 23 5
 * User: 14342
 * Date: 2020-11-30
 * Time: 19:17
 **/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] ret = str.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < ret.length; i++) {
            list.add(Integer.parseInt(ret[i]));
        }


        int k = list.remove(list.size()-1);
        Collections.sort(list);
        for (int i = 0; i < k; i++) {
            System.out.print(list.get(i)+" ");
        }
        }
    }

      /* Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
          int n = scanner.nextInt();
          if (n > 1000){
              n = 999;
          }
          List<Integer> list = new ArrayList<>();
          for (int i = 0; i < n; i++) {
              list.add(i);
          }
          int ret = 0;
          while(list.size() > 1){
              ret = (ret+2)%list.size();
              list.remove(ret);
          }
          System.out.println(list.get(0));
      }
    }
}
*/