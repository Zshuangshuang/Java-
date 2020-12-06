/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-06
 * Time: 8:54
 **/
public class ThreadDemo2 {
    private static boolean flag = false;
    static class MyThread extends  Thread{
        @Override
        public void run() {
            while(!flag){
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
        System.out.println("对方是内鬼，停止交易");
        flag = true;
    }
}
