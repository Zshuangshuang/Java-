import java.util.ArrayList;

public class SelectCourse {
    public MyListener myListener ;//监听者对象
    private String courseName;//课程名
    public int maxPeopleNum;//最大限制人数
    public int currentNum;//当前选课人数

    public ArrayList<String> students= new ArrayList<>();//用来保存学生信息
    //无参构造方法
    public SelectCourse(){
        this.courseName =" 组件技术";
    }
    //有参构造方法
    public SelectCourse(String courseName){
        this.courseName = courseName;
    }

    //返回课程名
    public String getCourseName() {
        return courseName;
    }
    //添加新学生,并返回学生人数
    public int addStudent(String name){

        this.students.add(name);

        currentNum = students.size();
        return currentNum;
    }
    //返回招生限额

    public int maxPeopleNum() {
        return maxPeopleNum;
    }
    //重置最大选课人数
    public void setMaxPeopleNum(int maxPeopleNum) {
        this.maxPeopleNum = maxPeopleNum;
    }

    //添加监听器
    public void addListener(EventListener eventListener){
        myListener = eventListener;
    }
    //通知监听器
    public void informListener(){
        MyEvent event = new MyEvent(this ,maxPeopleNum,currentNum);
        myListener.MyEvent(event);

    }
    //删除监听器
    public void removeListener(){
        myListener = null;
    }

}
