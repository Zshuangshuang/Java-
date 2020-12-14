/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-13
 * Time: 20:42
 **/
public class Process {
    private int arrivalTime;//进程的到达时间
    private int servicesTime;//进程的预计执行时间
    private int remainServiceTime;//进程还要服务的时间
    private int startTime;//开始时间
    private int waitTime;//等待时间
    private int finishTime;//完成时间
    private int turnAroundTime;//周转时间
    private double turnAroundTimeWithWeight;//带权周转时间

    public Process() {
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getServicesTime() {
        return servicesTime;
    }

    public void setServicesTime(int servicesTime) {
        this.servicesTime = servicesTime;
    }

    public int getRemainServiceTime() {
        return remainServiceTime;
    }

    public void setRemainServiceTime(int remainServiceTime) {
        this.remainServiceTime = remainServiceTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }

    public int getTurnAroundTime() {
        return turnAroundTime;
    }

    public void setTurnAroundTime(int turnAroundTime) {
        this.turnAroundTime = turnAroundTime;
    }

    public double getTurnAroundTimeWithWeight() {
        return turnAroundTimeWithWeight;
    }

    public void setTurnAroundTimeWithWeight(double turnAroundTimeWithWeight) {
        this.turnAroundTimeWithWeight = turnAroundTimeWithWeight;
    }

    @Override
    public String toString() {
        return "Process{" +
                "arrivalTime=" + arrivalTime +
                ", servicesTime=" + servicesTime +
                ", remainServiceTime=" + remainServiceTime +
                ", startTime=" + startTime +
                ", waitTime=" + waitTime +
                ", finishTime=" + finishTime +
                ", turnAroundTime=" + turnAroundTime +
                ", turnAroundTimeWithWeight=" + turnAroundTimeWithWeight +
                '}';
    }
}
