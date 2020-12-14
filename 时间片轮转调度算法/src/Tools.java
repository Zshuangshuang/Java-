import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:计算周转时间、带权周转时间等可以根据公式计算出来的变量
 * User: 14342
 * Date: 2020-12-13
 * Time: 20:45
 **/
public class Tools {
    //求周转时间
    public static double doAverageTurnAroundTime(ArrayList<Process> processList) {
         double sum = 0;
        for (int i = 0; i < processList.size(); i++) {
             sum += processList.get(i).getTurnAroundTime();

        }
         return Math.round(sum / processList.size() * 100) / 100.0;

    }
    //求带权周转时间
    public static double doAverageTurnAroundTimeWithWeight(ArrayList<Process> processList) {
         double sum = 0;
         for (int i = 0; i < processList.size(); i++) {
             sum += processList.get(i).getTurnAroundTimeWithWeight();

        }
         return Math.round(sum / processList.size() * 100) / 100.0;

    }


    public static void display(ArrayList<Process> processList) {
         System.out.println("\n    #运行结果#");

         System.out.print("\t到达时间:\t\t");
         for (int i = 0; i < processList.size(); i++) {
             System.out.print(processList.get(i).getArrivalTime() + "\t");

        }
         System.out.println();

         System.out.print("\t估计运行时间:\t");
         for (int i = 0; i < processList.size(); i++) {
             System.out.print(processList.get(i).getServicesTime() + "\t");

        }
         System.out.println();

         System.out.print("\t开始时间:\t\t");
         for (int i = 0; i < processList.size(); i++) {
             System.out.print(processList.get(i).getStartTime() + "\t");

        }
         System.out.println();

         System.out.print("\t完成时间:\t\t");
         for (int i = 0; i < processList.size(); i++) {
             System.out.print(processList.get(i).getFinishTime() + "\t");

        }
         System.out.println();

         System.out.print("\t周转时间:\t");
         for (int i = 0; i < processList.size(); i++) {
             System.out.print(processList.get(i).getTurnAroundTime() + "\t");

        }
        System.out.println();

        System.out.print("\t带权周转时间:\t");
         for (int i = 0; i < processList.size(); i++) {
             System.out.print(Math.round(processList.get(i).getTurnAroundTimeWithWeight() * 100) / 100.0 + "\t");

        }
         System.out.println();
         System.out.println("\t平均周转时间:" + Tools.doAverageTurnAroundTime(processList) + "\t");
         System.out.println("\t平均带权周转时间:" + Tools.doAverageTurnAroundTimeWithWeight(processList));
         System.out.println();

    }
}
