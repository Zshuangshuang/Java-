import java.util.EventObject;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-26
 * Time: 15:22
 **/
//实现事件方法
public class MyEvent  extends EventObject {

    int maxNumber,nowNumber;
    public MyEvent(Object source,int maxNumber,int nowNumber) {
        super(source);
        this.maxNumber = maxNumber;
        this.nowNumber = nowNumber;
    }
}
