import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-07
 * Time: 21:13
 **/
public class Main {
    public static String getSequeOddNum(int m){
        String ret = "";
        int start = 0;
        if (m%2 != 0){
            start = m*m - 2*(m/2);
        }else {
            start = m*m - 2*(m/2)+1;
        }
        ret += start;
        for (int i = 1; i < m; i++) {
            ret += "+"+(start+i*2);
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            String ret = getSequeOddNum(n);
            System.out.println(ret);
        }
    }
}
