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
        System.out.println("请输入最大人数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        sc.setMaxPeopleNum(n);
        sc.addListener(new EventListener());
        sc.addStudent("张飞");

        sc.addStudent("关羽");

        sc.addStudent("刘备");

        sc.addStudent("蔡文姬");

        sc.addStudent("廉颇");
        sc.informListener();

    }
}
