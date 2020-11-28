import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-28
 * Time: 21:42
 **/
public class Main2 {
    public static List<List<Integer>> yangHuiSanJ(int n){
        if (n <= 0){
            return null;
        }
       List<List<Integer>> result = new ArrayList<>();
       List<Integer> firstLine = new ArrayList<>();
       firstLine.add(1);
       result.add(firstLine);
       if (n == 1){
           return result;
       }
       List<Integer> secondLine = new ArrayList<>();
       secondLine.add(1);
       secondLine.add(1);
       result.add(secondLine);
       if (n == 2){
           return result;
       }
        for (int row = 3; row <= n; row++) {
            List<Integer> prevLine = result.get((row-1)-1);
            List<Integer> curLine = new ArrayList<>();
            curLine.add(1);
            for (int col = 2; col < row; col++) {
                int curNum = prevLine.get((col-1)-1)+prevLine.get(col-1);
                curLine.add(curNum);
            }
            curLine.add(1);
            result.add(curLine);
        }
        return result;
    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       List<List<Integer>> lists = yangHuiSanJ(n);
        for (List<Integer> list : lists){
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%5d",list.get(i));
            }
            System.out.println();
        }
    }
}
