/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-04
 * Time: 22:56
 **/
public abstract class Test1 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "he"+new String("llo");
        System.out.println(str1 == str2);
    }

}
