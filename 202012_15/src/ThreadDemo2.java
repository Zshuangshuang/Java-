/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-05
 * Time: 16:06
 **/
public class ThreadDemo2 {
    private static long count = 100_0000_000l;
    public static void serial(){
        long beg = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < count; i++) {
            a++;
        }
        int b = 0;
        for (int i = 0; i < count; i++) {
            b++;
        }
        long end = System.currentTimeMillis();
        System.out.println("time:"+(end-beg)+"ms");
    }
    public static void currency(){
        long beg = System.currentTimeMillis();
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                int a = 0;
                for (int i = 0; i < count; i++) {
                    a++;
                }
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run(){
                int b = 0;
                for (int i = 0; i < count; i++) {
                    b++;
                }
            }
        };
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("time:"+(end-beg)+"ms");
    }
    public static void main(String[] args) {
        serial();
        //currency();
    }
}
