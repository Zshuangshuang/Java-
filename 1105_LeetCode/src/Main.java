import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-05
 * Time: 14:52
 **/
public class Main {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        for (; k >0 ; k--) {
            int prev = grid[grid.length-1][grid[0].length-1];
            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[0].length; col++) {
                    int tmp = grid[row][col];
                    grid[row][col] = prev;
                    prev = tmp;
                }

            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int[] row:grid){
            List<Integer> list = new ArrayList<>();
            result.add(list);
            for (int v: row) {
               list.add(v);
            }
        }
return result;
    }
}
