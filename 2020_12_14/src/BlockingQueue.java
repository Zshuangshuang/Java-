/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-14
 * Time: 19:10
 **/
public class BlockingQueue {
    private int[] array = new int[100];
    private int head = 0;
    private int tail = 0;
    private int size = 0;
    public void add(int value) throws InterruptedException {
        synchronized (this) {
            while (size == array.length){
                wait();
            }
            array[tail] = value;
            tail++;
            if (tail == array.length){
                tail = 0;
            }
            size++;
            notifyAll();
        }
    }
    public int take() throws InterruptedException {
        int ret = -1;
        synchronized (this) {
            while (size == 0){
                wait();
            }
            ret = array[head];
            head++;
            if (head == array.length){
                head = 0;
            }

            size--;
            notifyAll();
        }
        return ret;
    }

    public static void main(String[] args) {
        BlockingQueue blockingQueue = new BlockingQueue();
        Thread producer = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    try {
                        blockingQueue.add(i);
                        System.out.println("生产元素："+i);
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        producer.start();
        Thread consumer = new Thread(){
            @Override
            public void run() {
                while(true){
                    try {
                        int ret = blockingQueue.take();
                        System.out.println("消费一个元素:"+ret);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        consumer.start();
    }
}
