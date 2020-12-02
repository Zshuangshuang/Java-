/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-02
 * Time: 19:35
 **/
import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        if (x == 0 || y == 0){
            return 0;
        }
        if (x == 1 || y == 1){
            return 1;
        }
        return countWays(x-1,y)+countWays(x,y-1);
    }
}