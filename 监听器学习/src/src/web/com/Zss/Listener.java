package src.web.com.Zss;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-15
 * Time: 14:12
 **/
public class Listener implements MyListener {
    @Override
    public void MyEvent(MyEvent event){
        if (event.nowNum > event.maxNum){
            System.out.println("超出人数限额");
            System.out.println("当前人数为："+event.nowNum);
            System.out.println("人数限额为："+event.maxNum);
            SelectSource sc = new SelectSource();
            System.out.println("请重新设置人数限额：");
            Scanner scanner = new Scanner(System.in);
            int maxNum = scanner.nextInt();
            sc.setMaxNum(maxNum);
            System.out.println("设置成功！当前最大人数为:"+maxNum);
        }
    }
}
