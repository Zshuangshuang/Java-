import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:用awt的可视化组件实现一个窗口
 * User: 14342
 * Date: 2020-12-15
 * Time: 13:11
 **/
public class MyFrame extends Frame{
    //写一个有参构造方法，显示Frame的标题
    public MyFrame(String str){
        super(str);
    }
    public static void main(String[] args) {
        //设置窗口标题
        MyFrame frame = new MyFrame("Hello Frame");
        //设置窗口大小，不设置默认为(0,0)
        frame.setSize(2000,300);
        //设置背景颜色
        frame.setBackground(Color.pink);
        //设置可见性，默认为不可见
        frame.setVisible(true);
    }
}
