import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-15
 * Time: 13:20
 **/
public class MyFrame2 extends Frame {
    public MyFrame2(String str){
        super(str);
    }
    public static void main(String[] args) {
        //实例化Frame对象
       MyFrame2 frame = new MyFrame2("你好，Frame");
       Panel panel = new Panel();
       //设置frame的属性
        frame.setSize(200,300);
        frame.setBackground(Color.pink);
        frame.setLayout(null);
        //设置panel属性
        panel.setSize(150,200);
        panel.setBackground(Color.BLACK);
        //将面板panel添加到frame中去
        frame.add(panel);
        frame.setVisible(true);
    }
}
