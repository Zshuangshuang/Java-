/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-11
 * Time: 21:45
 **/
public class MySort {
    public Process[] mySort(Process[] processes){
        Process tmp;
        for(int i=0;i<processes.length;i++){
            for(int j=i+1;j<processes.length;j++){
                if(processes[i].getComeTime()>processes[j].getComeTime()){
                    tmp = processes[i];
                    processes[i] = processes[j];
                    processes[j] = tmp;
                }
            }
        }
        return processes;
    }
}
