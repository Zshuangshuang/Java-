import java.util.Scanner;

/**Time: 13:33
 **/
public class Main2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] ch = str.toCharArray();
        int[] a = new int[10];
        for (int i = 0; i < ch.length; i++) {
            a[(int)ch[i]-48] += 1;
        }
        for (int i = 0; i < a.length; i++) {
           if (a[i] != 0){
               System.out.println(i+":"+a[i]);
           }
        }
    }
}
