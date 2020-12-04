import java.util.*;

public class Exchange {
    public int[] exchangeAB(int[] AB) {
        // write code here
        int left = 0;
        int right = AB.length-1;
        while(left < right){
            int tmp = AB[left];
            AB[left] = AB[right];
            AB[right] = tmp;
            left++;
            right--;
        }
        return AB;
    }
}