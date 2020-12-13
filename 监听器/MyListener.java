import java.util.EventListener;

//定义监听接口，负责监听MyEvent事件
public interface MyListener extends EventListener {
    public void MyEvent(MyEvent event);
}
