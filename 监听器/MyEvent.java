import java.util.EventObject;

//实现事件方法
public class MyEvent  extends EventObject {

    int maxNumber,nowNumber;
    public MyEvent(Object source,int maxNumber,int nowNumber) {
        super(source);
        this.maxNumber = maxNumber;
        this.nowNumber = nowNumber;
    }
}
