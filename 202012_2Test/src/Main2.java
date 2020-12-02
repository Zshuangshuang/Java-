/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-02
 * Time: 19:22
 **/
public class Main2 {
    public static int add(int a,int b){
        try {
            return a+b;
        }catch (Exception e){
            System.out.println("catch语句块");
        }finally {
            System.out.println("finally语句");

        }
        return 0;
    }
    public static void main(String[] args) {
        Main2 main2 = new Main2();
        System.out.println(add(45, 9));
    }
}
