public class PCB {
    private String name;//进程名
    private String state;//状态
    private Integer priority;//优先级
    private Integer serviceTime;//需要运行时间
    private Integer arriveTime;//到达时间
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getState() {
        return state;
    }
 
    public void setState(String state) {
        this.state = state;
    }
 
    public Integer getPriority() {
        return priority;
    }
 
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
 
    public Integer getServiceTime() {
        return serviceTime;
    }
 
    public void setServiceTime(Integer serviceTime) {
        this.serviceTime = serviceTime;
    }
 
    public Integer getArriveTime() {
        return arriveTime;
    }
 
    public void setArriveTime(Integer arriveTime) {
        this.arriveTime = arriveTime;
    }
 
    public PCB(String name, String state, Integer priority, Integer serviceTime, Integer arriveTime) {
        this.name = name;
        this.state = state;
        this.priority = priority;
        this.serviceTime = serviceTime;
        this.arriveTime = arriveTime;
    }
 
    public PCB() {
    }
}