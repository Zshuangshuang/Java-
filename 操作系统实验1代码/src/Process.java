/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-11
 * Time: 21:25
 **/
public class Process {
    private String processId;//进程标识
    private long runTime;//预计执行时间
    private long comeTime;//到达时间
    private long startTime;//开始执行时间
    private long finishTime;//结束时间
    private long turnaroundTime;//周转时间

    //用构造方法传参赋值
    public Process(String processId, long runTime, long comeTime) {
        this.processId = processId;
        this.runTime = runTime;
        this.comeTime = comeTime;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public long getRunTime() {
        return runTime;
    }

    public void setRunTime(long runTime) {
        this.runTime = runTime;
    }

    public long getComeTime() {
        return comeTime;
    }

    public void setComeTime(long comeTime) {
        this.comeTime = comeTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(long finishTime) {
        this.finishTime = finishTime;
    }

    public long getTurnaroundTime() {
        return turnaroundTime;
    }

    public void setTurnaroundTime(long turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }
}
