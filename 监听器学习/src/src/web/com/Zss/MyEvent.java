package src.web.com.Zss;

import java.util.EventObject;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-15
 * Time: 14:13
 **/
public class MyEvent extends EventObject {
    int maxNum;
    int nowNum;
    public MyEvent(Object source,int maxNum,int nowNum) {
        super(source);
        this.maxNum = maxNum;
        this.nowNum = nowNum;
    }
}
