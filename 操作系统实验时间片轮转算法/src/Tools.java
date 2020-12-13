import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-13
 * Time: 20:45
 **/
public class Tools {



    public static double calcAverageTurnAroundTime(
    ArrayList<Process> processList) {
         double sum = 0;
        for (int i = 0; i < processList.size(); i++) {
             sum += processList.get(i).getTurnAroundTime();

        }
         return Math.round(sum / processList.size() * 100) / 100.0;

    }


    public static double calcAverageTurnAroundTimeWithWeight(
ArrayList<Process> processList) {
         double sum = 0;
         for (int i = 0; i < processList.size(); i++) {
             sum += processList.get(i).getTurnAroundTimeWithWeight();

        }
         return Math.round(sum / processList.size() * 100) / 100.0;

    }


    public static void printResult(ArrayList<Process> processList) {
         System.out.println("\n    #RESULT#");

         System.out.print("\tArrive:\t\t");
         for (int i = 0; i < processList.size(); i++) {
             System.out.print(processList.get(i).getArrivalTime() + "\t");

        }
         System.out.println();

         System.out.print("\tService:\t");
         for (int i = 0; i < processList.size(); i++) {
             System.out.print(processList.get(i).getServicesTime() + "\t");

        }
         System.out.println();

         System.out.print("\tStart:\t\t");
         for (int i = 0; i < processList.size(); i++) {
             System.out.print(processList.get(i).getStartTime() + "\t");

        }
         System.out.println();

         System.out.print("\tWait:\t\t");
         for (int i = 0; i < processList.size(); i++) {
             System.out.print(processList.get(i).getWaitTime() + "\t");

        }
         System.out.println();

         System.out.print("\tFinish:\t\t");
         for (int i = 0; i < processList.size(); i++) {
             System.out.print(processList.get(i).getCompletionTime() + "\t");

        }
         System.out.println();

         System.out.print("\tTurn around:\t");
         for (int i = 0; i < processList.size(); i++) {
             System.out.print(processList.get(i).getTurnAroundTime() + "\t");

        }
        System.out.println();

        System.out.print("\tTA wight:\t");
         for (int i = 0; i < processList.size(); i++) {
             System.out.print(Math.round(processList.get(i)
                     .getTurnAroundTimeWithWeight() * 100) / 100.0 + "\t");

        }
         System.out.println();

         System.out.println("\tAverage turn around time:"
         + Tools.calcAverageTurnAroundTime(processList) + "\t");
        System.out.println("\tAverage turn around time with wight:"
        + Tools.calcAverageTurnAroundTimeWithWeight(processList));
        System.out.println();

    }
}
