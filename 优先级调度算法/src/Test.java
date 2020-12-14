import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-14
 * Time: 9:36
 **/
public class Test {
    static List<PCB> listOfProcess = new ArrayList();
    public static void main(String[] args) {
        PriorityDispatch priorityDispatch = new PriorityDispatch();
        System.out.println("**** 请输入进程号：");
        //存入总进程数
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        //初始化进程信息，输入所有进程信息
        priorityDispatch.input(num);
        //显示所有进程
        System.out.println("**** 当前就绪队列状态为:");
        for (int i = 0; i < listOfProcess.size(); i++){
            priorityDispatch.display(listOfProcess.get(i));
        }
        System.out.println();
        //初始时间
        int curTime = 0;

        while (listOfProcess.size() != 0){
            curTime++;
            System.out.println();
            System.out.println("**** 当前时间是:"+curTime);
            System.out.println();
            listOfProcess.get(0).setState("run");
            priorityDispatch.check(listOfProcess.get(0));
            priorityDispatch.running(listOfProcess.get(0));
            System.out.println("**** 输入任意值，并按回车键继续：");
            s.next();

        }

        System.out.println("**** 进程已经完成.");
    }
    }

