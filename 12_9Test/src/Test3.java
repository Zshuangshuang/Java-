/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-09
 * Time: 20:54
 **/
public class Test3 {

    public static void main(String[] args) {
        int i = 5;
        int ret = (i++)+(++i)+(i--)+(--i);
        System.out.println(ret);
    }
}
