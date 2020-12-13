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
    private int processNumber;
    private ArrayList<Process> processList;
    private int timeSlice;
    public RR(){
        init();
        calc();
        Tools.printResult(processList);
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
        int timeNow = 0;
        int processRemain = processNumber;
        boolean noProcessRunInThisTurn;
        Process opProcess;
        while (processRemain != 0){
            noProcessRunInThisTurn = true;
            for (int i = 0; i < processNumber; i++) {
                opProcess = processList.get(i);
                if (opProcess.getRemainServiceTime() > 0 && timeNow >= opProcess.getArrivalTime()){
                    if (opProcess.getServicesTime() == opProcess.getRemainServiceTime()){
                        int waitTime = timeNow - opProcess.getArrivalTime();
                        opProcess.setStartTime(timeNow);
                        opProcess.setWaitTime(waitTime);
                    }
                    int remainServiceTime = opProcess.getRemainServiceTime()- timeSlice;
                    opProcess.setRemainServiceTime(remainServiceTime);
                    if (remainServiceTime <= 0){
                        int completionTime = timeNow + timeSlice;
                        int turnAroundTime = completionTime - opProcess.getArrivalTime();
                        double turnAroundTimeWithWeight = 1.0 * turnAroundTime  / opProcess.getServicesTime();
                        opProcess.setCompletionTime(completionTime);
                        opProcess.setTurnAroundTime(turnAroundTime);
                        opProcess.setTurnAroundTimeWithWeight(turnAroundTimeWithWeight);
                        processRemain--;
                    }
                    timeNow += timeSlice;
                    noProcessRunInThisTurn = false;
                }
            }
            if ((processRemain > 0) && noProcessRunInThisTurn) {
                timeNow += timeSlice;
            }
        }
    }
}
