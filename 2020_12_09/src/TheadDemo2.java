/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-09
 * Time: 18:53
 **/

public class TheadDemo2 {
   static class Counter{
       public int count = 0;

       synchronized public void increase(){
            count++;
        }
    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    counter.increase();
                }
            }
        };
        thread1.start();
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    counter.increase();
                }
            }
        };
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.count);
    }
}
