package src.web.com.Zss;

import java.util.ArrayList;

public class SelectSource {
    public MyListener myListener;//定义监听器对象
    public String courseName;//定义课程名称
    public int curNum;//定义当前人数
    public int maxNum;//定义人数限制
    public ArrayList<String> student = new ArrayList<>();//保存学生信息
    //有参构造方法
    public SelectSource(String courseName){
        this.courseName = courseName;
    }
    //无参构造方法
    public SelectSource(){

    }
    //添加学生
    public int addStudent(String name){
        student.add(name);
        curNum = student.size();
        return curNum;
    }
    //设置最大人数
    public void  setMaxNum(int n){
       this.maxNum = n;

    }
    //添加监听器
    public void addListener(Listener listener){
        myListener = listener;
    }
    //通知监听器
    public void notifyListener(){
        MyEvent event = new MyEvent(this,maxNum,curNum);
        myListener.MyEvent(event);
    }
    //删除监听器
    public void remove(){
        myListener = null;
    }


}
