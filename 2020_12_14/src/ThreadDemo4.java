import jdk.nashorn.internal.objects.annotations.Function;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-14
 * Time: 20:23
 **/
public class ThreadDemo4 {
        /**
         *
         *Task是一个任务类，用来描述一段逻辑，一方面说明一个要执行的任务，另一方面记录啥时候执行这个任务
         *
         * */
    static class Task implements Comparable<Task>{
        private Runnable command;
        //time标识啥时候来执行command,是一个绝对时间
        private long time;

        public Task(Runnable command, long after) {
            this.command = command;
            this.time = System.currentTimeMillis()+after;
        }
        public void run(){
            command.run();
        }

        @Override
        public int compareTo(Task o) {
            //时间小的先执行
            return (int) (this.time-o.time);
        }
    }

    static class Worker extends Thread{
        private PriorityBlockingQueue<Task> queue = null;
        private Object mailBox = null;

        public Worker(PriorityBlockingQueue<Task> queue,Object mailBox) {
            this.queue = queue;
            this.mailBox = mailBox;
        }

        @Override
        public void run() {
            while(true){
                try {
                    //取出队首元素，检查时间是否到了
                    Task task = queue.take();
                    long curTime = System.currentTimeMillis();
                    //时间还没有到，塞回去
                    if (task.time > curTime){
                        queue.put(task);
                        synchronized (mailBox){
                            mailBox.wait(task.time-curTime);
                        }
                    }else {
                        task.run();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }


            }
        }
    }
    static class Timer{
        private Object mailBox = new Object();
        //由于是有优先级的，所以需要给Task实现comparable接口，确定比较规则
        private PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<>();
        public Timer(){
            //创建线程
            Worker worker = new Worker(queue,mailBox);
            worker.start();
        }
        //安排任务
        public void schedule(Runnable command,long after){
            Task task = new Task(command,after);
            queue.put(task);
            synchronized (mailBox){
                mailBox.notify();
            }
        }

    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("邓伦的爱豆");
                timer.schedule(this,2000);
            }
        },2000);
    }

}
