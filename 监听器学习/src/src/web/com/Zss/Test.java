package src.web.com.Zss;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-15
 * Time: 14:25
 **/
public class Test {

    public static void main(String[] args) {
        SelectSource sc = new SelectSource("组件技术");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入最大限额人数：");
        int maxNum = scanner.nextInt();
        sc.setMaxNum(maxNum);
        sc.addListener(new Listener());
        sc.addStudent("1");
        sc.addStudent("2");
        sc.addStudent("3");
        sc.notifyListener();
    }
}
