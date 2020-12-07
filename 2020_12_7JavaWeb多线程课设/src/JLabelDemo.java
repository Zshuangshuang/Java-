import javax.swing.*;
import java.awt.*;
import java.util.zip.ZipEntry;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-07
 * Time: 8:07
 **/
public class JLabelDemo {


    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                JFrame frame = new JFrame("我是主窗口");
                //取得当前窗体的容器
                Container container=frame.getContentPane();
                //实例化4个标签
                JLabel label1 = new JLabel("标签1",JLabel.LEFT);
                JLabel label2 = new JLabel("标签2",JLabel.RIGHT);
                JLabel label3 = new JLabel("标签3",JLabel.CENTER);
                JLabel label4 = new JLabel("标签4", JLabel.LEFT);
                //将组建放入窗口容器
                container.add(label1);
                //将组件插入面板
                frame.add(label1);
                frame.setBackground(Color.pink);
                //设置窗口大小
                frame.setSize(500,300);
                frame.setLocation(400,200);
                frame.setVisible(true);

            }
        };
        thread.start();

    }

}