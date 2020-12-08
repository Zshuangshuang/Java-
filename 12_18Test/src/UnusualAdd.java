import java.util.*;

public class UnusualAdd {
    public int addAB(int A, int B) {
        if (B == 0){
            return A;
        }
        int sum = A^B;
        int ret = (A&B)<<1;
        if (ret == 0){
            return sum;
        }
        return addAB(sum,ret);
    }
}