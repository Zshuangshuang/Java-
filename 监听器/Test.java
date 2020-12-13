import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        SelectCourse sc=new SelectCourse();//实例化对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入最大限额人数：");
        int maxNum = scanner.nextInt();
        sc.setMaxPeopleNum(maxNum);
        sc.addListener(new EventListener());
        sc.addStudent("a");
        sc.addStudent("b");
        sc.addStudent("c");
        sc.addStudent("d");
        sc.informListener();
    }
}
