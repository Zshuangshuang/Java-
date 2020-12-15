import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-10
 * Time: 17:39
 **/
public class ThreadDemo1 {
    static class Counter{
        public volatile int flag = 0;
    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(){
            @Override
            public void run() {

                while(counter.flag == 0){

                }
                System.out.println("循环结束");
            }
        };
        thread1.start();
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                System.out.println("请输入一个数字");
                Scanner scanner = new Scanner(System.in);
                counter.flag = scanner.nextInt();
            }
        };
        thread2.start();

    }
}
