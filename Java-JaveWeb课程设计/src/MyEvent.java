import java.util.EventObject;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-26
 * Time: 15:22
 **/
//实现事件方法:也就是实现给最大人数和当前人数的赋值
public class MyEvent  extends EventObject {

    int maxNumber,nowNumber;

    public MyEvent(Object source,int maxNumber,int nowNumber) {
        super(source);
        this.maxNumber = maxNumber;
        this.nowNumber = nowNumber;
    }
}
