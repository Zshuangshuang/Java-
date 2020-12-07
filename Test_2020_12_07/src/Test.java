/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-07
 * Time: 19:34
 **/
public class Test {
    public static void main(String[] args) {
        String str1 = "abc"+"def";
        String str2 = new String(str1);
        if (str1.equals(str2))
            System.out.println("success");

        System.out.println("======");
        if (str1 == str2){
            System.out.println("success");
        }
    }
}
