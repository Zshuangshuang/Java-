/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-06
 * Time: 23:27
 **/
public class Main1 {

    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                dianping();
            }
        };
        thread.run();
        System.out.print("大众");
    }static void dianping(){
        System.out.print("dianping");
    }
}
