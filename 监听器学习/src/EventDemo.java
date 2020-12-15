import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-15
 * Time: 13:53
 **/
public class EventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("我是Frame");
        JButton button = new JButton("点我");
        //注册监听事件
        button.addActionListener(new Listener());
        frame.getContentPane().add(button, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
