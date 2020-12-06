import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-06
 * Time: 8:19
 **/
public class ThreadDemo1 {
    static class MyThread extends  Thread{

        public MyThread(String s) {
            super(s);
        }

        @Override
        public void run() {
            for (int i = 0; i <= 1; i++) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("线程没了");
        }

    }
    public static void main(String[] args) {
        Thread thread = new MyThread("邓伦");
        System.out.println(thread.getId());
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.isDaemon());
        System.out.println(thread.getState());
        System.out.println(thread.isInterrupted());
        thread.start();
        while (thread.isAlive()){
            System.out.println(thread.getState());
            System.out.println(thread.isAlive());
            System.out.println(thread.isInterrupted());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
