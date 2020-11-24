import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-23
 * Time: 19:20
 **/
public class Main {



   /* public static int count(int[] A, int n) {


       int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (A[i] > A[j]){
                    count++;
                }
            }
        }
        return count;
        
    }
    */
    public static int fun(int n){

        if (n == 1){
            return 0;
        }
        if (n == 2){
            return 1;
        }
       return n/3+fun(n%3+n/3);


    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       while(scanner.hasNext()){
           int n = scanner.nextInt();
           if (n != 0) {
               System.out.println(fun(n));
           }

       }
    }

}
