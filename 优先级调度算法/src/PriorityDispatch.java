import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class PriorityDispatch {
    List<PCB> listOfProcess = new ArrayList();
    /**
    *  建立进程就绪函数(进程运行时间到,置就绪状态）
    */
    public  void running(PCB pcb) {
        //设置到达时间：
        pcb.setArriveTime(pcb.getArriveTime()+1);
        //如果进程的到达时间和它的运行时间相等，那么就相当于这个进程已经运行完毕，可以销毁
        if (pcb.getArriveTime() == pcb.getServiceTime()){
            destroy();
            System.out.println(pcb.getName()+"以运行完成");
        }else {
            pcb.setPriority(pcb.getPriority()-1);
            pcb.setState("wait");
            sort(listOfProcess,0,listOfProcess.size()-1);
            Collections.reverse(listOfProcess);
            showWait();
        }
    }
 
    /*建立进程撤消函数(进程运行结束,撤消进程)*/
    public  void destroy() {
        listOfProcess.remove(0);
    }
 
    /*建立就绪队列查看函数*/
    public  void showWait(){
        System.out.println("**** 运行完一个时间片之后，就绪队列为：");
        for (int i = 0; i < listOfProcess.size(); i++){
            display(listOfProcess.get(i));
        }
        System.out.println();
    }
 
 
    /*建立对进程进行优先级排列函数*/
    public  void sort(List<PCB> listOfProcess, int low, int high) {
        /**
         * 初始化start、end、key
         * start为从前往后的游动下标
         * end为从后往前的游动下标
         * key是最开始的基准，在本轮递归中是不变的，变的是两个游标上的值
         */
        int start = low;
        int end = high;
        int key = listOfProcess.get(low).getPriority();
 
        /**
         * 一切的一切，都是为了分治
         * 一轮下来，找到当前队列的关键值，左边的值都比关键值小，右边的值都比关键值大
         */
         while (end > start){
 
            /**
             * 从后到前
             *
             * 1、这里为什么还要判断end>start？
             * 判断是否逼近结束。
             * 啰嗦的解释：因为end不断在变，用于判断从后往前时是否到了与start最近处。
             *
             * 2、这里为什么判断listOfProcess.get(end).getPriority() >= key？
             * 为了end从后往前逼近关键值。
             * 是为了从后往前找到第一个比基准小的值，进行交换。确保本次从后往前排序的时候，以基准为标准，end游动下标后面的值比基准大
             */
            while (end > start && listOfProcess.get(end).getPriority() >= key){
                end--;
            }
            //start与end值交换，把基准值换到end位置上，此时，end是从end开始往后的队列中，值最小的
             if (listOfProcess.get(end).getPriority() <= key){
                PCB temp = listOfProcess.get(end);
                listOfProcess.set(end, listOfProcess.get(start));
                listOfProcess.set(start, temp);
             }
 
 
            //从前往后，道理一样，从前开始保证，start前的都比start小
             while (end > start && listOfProcess.get(start).getPriority() <= key){
                 start++;
             }
             //start与end值交换，把基准值换到start位置上，此时，start是从start开始往前的队列中，值最大的
             if (listOfProcess.get(start).getPriority() >= key){
                 PCB temp = listOfProcess.get(end);
                 listOfProcess.set(end, listOfProcess.get(start));
                 listOfProcess.set(start, temp);
             }
        }
 
        /**
         * 以上是为了找到关键值，接下来的递归才是重中之重
         *
         * 1、为什么要判断low < start、high > end？
         * 因为，当start没有改变时，说明这一段已经排序ok，无需接着往下递归了
         *
         * 2、start为什么-1，end为什么+1？
         * start和end若不重合，两者已经排序好了
         * 若重合，则这个重合的地方已经确定排序
         *
         */
        if (low < start){
            sort(listOfProcess, low, start-1);
        }
        if (high > end){
            sort(listOfProcess, end+1, high);
        }
 
 
    }
 
 
    /*建立进程查看函数*/
    public  void check(PCB pcb){
        //显示正在运行的进程
        System.out.println("**** 当前正在运行的进程是:"+pcb.getName());
        display(pcb);
 
        //显示就绪进程
        System.out.println("**** 当前就绪队列状态为:");
        for (int i = 1; i < listOfProcess.size(); i++){
            display(listOfProcess.get(i));
        }
        System.out.println();
    }
 
    /*建立进程显示函数,用于显示当前进程*/
    public void display(PCB pcb) {
        System.out.println("进程名 \t 进程状态 \t 优先级 \t 运行时间 \t 到达时间");
        System.out.println(pcb.getName()+" \t "+ pcb.getState()+" \t "+pcb.getPriority()+" \t\t "+pcb.getServiceTime()+" \t\t\t "+pcb.getArriveTime());
    }
 
    /*建立进程控制块函数*/
    public void input(int num) {
        Scanner s = new Scanner(System.in);
        //填充列表
        for (int i = 0; i < num; i++){
            System.out.println("输入进程名:");
            String name = s.next();
            System.out.println("输入进程优先数:");
            int priority = s.nextInt();
            System.out.println("输入进程运行时间:");
            int serviceTime = s.nextInt();
            System.out.println();
 
            //初始化当前进程的PCB
            PCB pcb = new PCB(name,"wait",priority,serviceTime,0);
            //加入队列
            listOfProcess.add(pcb);
        }
        //建立对进程进行优先级排列函数
        sort(listOfProcess, 0, (listOfProcess.size()-1));
        Collections.reverse(listOfProcess);
    }
 
 
 
 
 
 
 
}