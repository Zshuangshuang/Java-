/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-08
 * Time: 19:32
 **/

class A{
    public A(String s){

    }
}
public class Test3 {

    public static void main(String[] args) {
        A classA = new A("he");
        A classB = new A("he");
        System.out.println(classA==classB);
    }
}
