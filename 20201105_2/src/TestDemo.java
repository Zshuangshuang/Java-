import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-05
 * Time: 11:04
 **/
public class TestDemo {


    public List<List<Integer>> generate(int numRows){
        //判断numRows参数的合法性
        if (numRows <= 0){
            return new ArrayList<>();
        }
        //定义result来保存最后的结果
        List<List<Integer>> result = new ArrayList<>();
        //处理第一行,第一行仅含一个1
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        if (numRows == 1){
            return result;
        }
        List<Integer> secondLine =new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if (numRows == 2){
            return result;
        }
        //处理第i行
        for (int row = 3; row < numRows; row++) {
            //row-1表示row-1行，row-1行用下标表示就是row-1-1;
            List<Integer> prevLine = result.get((row-1)-1);
            List<Integer> curLine = new ArrayList<>();
            curLine.add(1);
            for (int col = 2; col < row; col++) {
                int curNum = prevLine.get(col-1-1)+prevLine.get(col-1);
                curLine.add(curNum);
            }
            curLine.add(1);
            result.add(curLine);
        }
        return result;

    }

}
