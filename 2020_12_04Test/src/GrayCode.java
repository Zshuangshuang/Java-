import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-04
 * Time: 23:17
 **/
public class GrayCode {
    public static String[] getGray(int n) {
        // write code here
        List<String > list = new LinkedList<>();
        String[] result = new String[0];
        if (n == 0){
            return list.toArray(result);
        }
        list.add("0");
        list.add("1");
        for (int i = 1; i < n; i++) {
            List<String> ret = new LinkedList<>();
            for (int j = 0; j < list.size(); j++) {
                ret.add("0"+list.get(j));
            }
            for (int j = list.size()-1; j >= 0; j--) {
                ret.add("1"+list.get(j));
            }
            list= ret;
        }
        return list.toArray(result);
    }


}
