import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-11
 * Time: 21:30
 **/
public class ProcessInit {
    public static Process[] getProcess(){
        int processNum = 4;
        Process[] processes = new Process[4];
        processes[0] = new Process("A",5,0);
        processes[1] = new Process("B",3,1);
        processes[2] = new Process("C",5,3);
        processes[3] = new Process("D",2,4);
        return processes;
    }
}
