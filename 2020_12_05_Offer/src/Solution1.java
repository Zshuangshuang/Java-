/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-05
 * Time: 18:36
 **/
public class Solution1 {
    //方法(2):利用二分查找的方法：取左下角的第一个元素m和target作比较
    //由于满足每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序
    //如果说m<target，则说明target在m的右侧
    //若m>target，则说明target在m的上方

    public boolean Find(int target, int [][] array) {
        //定义二维数组的行数
        int rows = array.length;
        if (rows == 0){
            return false;
        }
        //定义二位数组的列数
        int cols = array[0].length;
        if (cols == 0){
            return false;
        }
        //找到m的位置
        int row = rows-1;
        int col = 0;
        int m = array[row][col];
        while(row >= 0 && col < cols){
            if (m > target){
                row--;
            }else if(m < target){
                col++;
            }else {
                return true;
            }
        }
        return false;
    }
    
    //方法(1):暴力解决——》直接遍历
    
    /*public  boolean Find(int target, int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == target){
                    return true;
                }
            }
        }
        return false;

    }*/


}
