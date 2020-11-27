import java.util.EventListener;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-26
 * Time: 16:58
 **/
//定义监听接口，负责监听MyEvent事件
public interface MyListener extends EventListener {
    public void MyEvent(MyEvent event);
}
