/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-05
 * Time: 13:39
 **/
public class ThreadDemo1 {
    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("hello world,我是一个线程");
            while(true){

            }
        }

    }
    public static void main(String[] args) {
        //当thread对象new出来的时候，内核中并未随之产生一个线程（PCB）
        Thread thread = new MyThread();
        //当调用start方法的时候，才真正创建了线程
        //创建线程的同时，内核随之产生一个PCB，让CPU执行相应的方法内容（run方法）
        thread.start();
        while(true){

        }
    }
}
