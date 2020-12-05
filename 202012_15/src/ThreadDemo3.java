/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-05
 * Time: 16:28
 **/
public class ThreadDemo3 {

    static class MyRunnable implements  Runnable{
        @Override
        public void run() {
            System.out.println("我是新线程");
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("我是新线程");
        });
        thread.start();
    }
}
