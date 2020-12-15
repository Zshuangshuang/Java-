

import javax.swing.*;
import java.awt.*;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-15
 * Time: 13:29
 **/
public class JFrame {


    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame("Hello Frame");
        JButton button = new JButton("点我");
        frame.getContentPane().add(button,BorderLayout.CENTER);
        frame.setVisible(true);

    }

}
