import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-13
 * Time: 20:49
 **/
public class RR {
    private int processNumber;//进程数量
    private ArrayList<Process> processList;//进程集合类
    private int timeSlice;//时间片的大小
    //初始化RR
    public RR(){
        init();
        calc();
        Tools tools = new Tools();
        tools.display(processList);
    }
    private void init(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入时间片：");
        timeSlice = sc.nextInt();
        System.out.println("请输入进程个数：");
        processNumber = sc.nextInt();
        processList = new ArrayList<Process>();
        for (int i = 0; i < processNumber; i++) {
            processList.add(new Process());
        }
        System.out.println("请输入进程到达的时间：");
        for (int i = 0; i < processNumber; i++) {
            System.out.print("    Process" + (i + 1) + ":");
            processList.get(i).setArrivalTime(sc.nextInt());
        }
        System.out.println("请输入进程的服务时间");
        for (int i = 0; i < processNumber; i++) {
            System.out.print("    Process" + (i + 1) + ":");
            int servicesTime = sc.nextInt();
            processList.get(i).setServicesTime(servicesTime);
            processList.get(i).setRemainServiceTime(servicesTime);
        }

    }
    private void calc(){
        int timeNow = 0;//现在时间
        int processRemain = processNumber;//还没有在CPU上执行的进程数
        boolean noProcessRunInThisTurn;//标志位：标识当前进程可以执行
        Process process;
        while (processRemain != 0){
            noProcessRunInThisTurn = true;
            for (int i = 0; i < processNumber; i++) {
                process = processList.get(i);
                //可以继续执行的两个条件：(1)当前进程还需要服务的时间>0;(2)现在时间>进程的到达时间
                if (process.getRemainServiceTime() > 0 && timeNow >= process.getArrivalTime()){
                    //服务时间 = 停留时间
                    if (process.getServicesTime() == process.getRemainServiceTime()){
                        //等待时间 = 现在的时间-到达时间
                        int waitTime = timeNow - process.getArrivalTime();
                        process.setStartTime(timeNow);
                        process.setWaitTime(waitTime);
                    }
                    //还需要服务的时间 = 需要服务的时间-时间片
                    int remainServiceTime = process.getRemainServiceTime()- timeSlice;
                    //重新设置需要服务的时间
                    process.setRemainServiceTime(remainServiceTime);
                    //如果说需要服务的时间已经<=0，那么该进程已经执行完毕
                    if (remainServiceTime <= 0){
                        //完成时间 = 现在的时间+时间片的大小
                        int finishTime = timeNow + timeSlice;
                        //周转时间 = 完成时间-到达时间
                        int turnAroundTime = finishTime - process.getArrivalTime();
                        //带权周转时间 = 周转时间/服务时间
                        double turnAroundTimeWithWeight = 1.0 * turnAroundTime  / process.getServicesTime();
                        process.setFinishTime(finishTime);
                        process.setTurnAroundTime(turnAroundTime);
                        process.setTurnAroundTimeWithWeight(turnAroundTimeWithWeight);
                        processRemain--;
                    }
                    //现在的时间 = 现在时间+时间片大小
                    timeNow += timeSlice;
                    //现在有进程在执行
                    noProcessRunInThisTurn = false;
                }
            }
            //如果说还有进程没有执行完毕并且现在没有进程在使用CPU，那么也就是说还需要继续执行，当前时间也要分配给它一个时间片
            if ((processRemain > 0) && noProcessRunInThisTurn) {
                timeNow += timeSlice;
            }
        }
    }
}
