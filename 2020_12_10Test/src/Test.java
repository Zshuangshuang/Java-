/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-10
 * Time: 19:42
 **/
public class Test {
    public String name = "abc";

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(t1.equals(t2)+","+t1.name.equals(t2.name));
    }
}
