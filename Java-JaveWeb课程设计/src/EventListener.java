/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-26
 * Time: 17:01
 **/
//定义一个事件监听类实现监听接口，判断添加人数是否超出招生限额
public class EventListener implements MyListener{
    @Override
    public void MyEvent(MyEvent event) {
    if (event.nowNumber > event.maxNumber){
        System.out.println("已经超过最大人数");
        System.out.println("当前人数为:"+event.nowNumber );
        System.out.println("人数限额为："+event.maxNumber);
    }else {
        System.out.println("可以继续添加新学生");
    }
    }

    }
