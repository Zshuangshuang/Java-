/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-09
 * Time: 18:44
 **/
public class ThreadDemo1 {

    public static void main(String[] args) {
        Thread thread = new Thread(){

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {

                }
            }
        };
        System.out.println("线程开始前"+thread.getState());
        thread.start();
        while(thread.isAlive()){
            System.out.println("线程进行中"+thread.getState());
        }
        System.out.println("线程结束了"+thread.getState());
    }
}
