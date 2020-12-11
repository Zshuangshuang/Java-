import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-11
 * Time: 21:35
 **/
public class FirstCFirstS {
    public int execute(Process[] processList) {
        //如果进程对象为空或其长度为零则出错
        if (processList == null || processList.length == 0) {
            System.out.println(">数据为空");
            return -1;
        }

        Process[] p = processList;
        int runTimeSum = 0;
        MySort sort = new MySort();
        //按照到达时间进行排序
        sort.mySort(p);
        //将进程对象进行遍历
        for (Process model : p) {
            //如果总时间小于进程到达的时间,总时间变为该进程到来的时间：
            if (runTimeSum < model.getComeTime()) {
                runTimeSum = (int) model.getComeTime();
            }
            //将总时间设置为进程开始执行的时间
            model.setRunTime(runTimeSum);
            //该进程运行后的总时间
            runTimeSum += model.getRunTime();
            //设置该进程结束的时间
            model.setFinishTime(runTimeSum);
            //设置该进程的周转时间
            model.setTurnaroundTime(runTimeSum - model.getComeTime());
        }
        return runTimeSum;
    }

}
