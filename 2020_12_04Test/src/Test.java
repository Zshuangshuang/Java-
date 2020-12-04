/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-04
 * Time: 22:40
 **/
public class Test {
    public static void add(Byte b){
        b = b++;
    }

    public static void main(String[] args) {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.println(a);
        add(b);
        System.out.println(b);
    }
}
