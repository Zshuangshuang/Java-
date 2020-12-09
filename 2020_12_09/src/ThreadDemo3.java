import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-09
 * Time: 20:09
 **/
public class ThreadDemo3 {

    public static void main(String[] args) {
        Object locker1 = new Object();
        Object locker2 = new Object();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                synchronized (locker1.getClass()) {
                    System.out.println("请输入一个整数");
                    int num = scanner.nextInt();
                    System.out.println("num = "+num);
                }
            }
        };
        thread1.start();
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                while(true){
                    synchronized (locker2.getClass()){
                        System.out.println("线程2获取到🔒");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        thread2.start();
    }
}
