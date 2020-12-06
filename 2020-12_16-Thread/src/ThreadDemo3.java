/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-06
 * Time: 9:18
 **/
public class ThreadDemo3 {
    static class MyThread extends Thread{
        @Override
        public void run() {
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("正在交易");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("线程结束了");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("它是内鬼，终止交易");
        thread.interrupt();

    }
}
