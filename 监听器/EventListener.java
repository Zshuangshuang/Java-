import java.util.Scanner;
//事件监听器，实现监听器接口，判断添加人数是否超出招生限额
public class EventListener implements MyListener{
    @Override
    public void MyEvent(MyEvent event) {
        if (event.nowNumber > event.maxNumber){
            System.out.println("超出最大招生人数");
            System.out.println("当前人数为:"+event.nowNumber );
            System.out.println("人数限额为:"+event.maxNumber);
            SelectCourse sc=new SelectCourse();
            System.out.println("请输入新的最大招生人数");
            Scanner s = new Scanner(System.in);
            sc.maxPeopleNum=s.nextInt();
            System.out.println("设置完成，当前最大人数为：" + sc.maxPeopleNum());

        }
    }

}
