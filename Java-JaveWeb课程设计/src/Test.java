import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-26
 * Time: 17:14
 **/
public class Test {
    public static void main(String[] args) {
        SelectCourse sc=new SelectCourse();
        sc.setMaxPeopleNum(3);
        sc.addListener(new EventListener());
        sc.addStudent("张飞");
        sc.informListener();
        sc.addStudent("关羽");
        sc.informListener();
        sc.addStudent("刘备");
        sc.informListener();
        sc.addStudent("蔡文姬");
        sc.informListener();
    }
}
