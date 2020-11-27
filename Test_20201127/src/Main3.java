import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-27
 * Time: 19:53
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            String[] ret = str.split(" ");
            int[] array = new int[ret.length];
            for (int i = 0; i < ret.length; i++) {
                array[i] = Integer.parseInt(ret[i]);
            }
            int A = array[0];
            int B = array[1];
            int C = array[2];
            int D = array[3];
            int a = (A+C)/2;
            int b = (B+D)/2;
            int c = (D-B)/2;
            if (a-((A+C)/2) != 0){
                System.out.println("No");
                return;
            }
            if (b-((B+D)/2) != 0 || b-((C-A)/2) != 0){
                System.out.println("No");
                return;
            }
            if (c-(D-B)/2 != 0){
                System.out.println("No");
                return;
            }
                System.out.println(a+" "+b+" "+c);

        }
    }
}
