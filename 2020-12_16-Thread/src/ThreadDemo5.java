/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-06
 * Time: 9:41
 **/
public class ThreadDemo5 {
    private static boolean f = false;
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                while(!f){
                    System.out.println("正在交易");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("交易结束");
            }
        };
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        f = true;
    }
}
