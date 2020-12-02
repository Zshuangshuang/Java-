/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-02
 * Time: 19:16
 **/
public class Main1 {

    public static void main(String[] args) {

        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        op(a,b);
        System.out.println(a+" "+b);
    }
    public static void op(StringBuffer x,StringBuffer y){
        x.append(y);
        System.out.println(x);
        y = x;
    }
}
