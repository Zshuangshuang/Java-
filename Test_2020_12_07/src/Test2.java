/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-07
 * Time: 19:41
 **/
class A{

}
class B extends A{

}
class C extends B{

}
public class Test2 {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new B();
        A a3 = new C();
    }
}
