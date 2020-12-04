/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-04
 * Time: 13:40
 **/
import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        int sum = 1;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i == j){
                    continue;
                }
                sum *= A[j];
            }
            B[i] = sum;
            sum = 1;
        }
        return B;
    }
}