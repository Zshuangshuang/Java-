import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class demo4 {
    JFrame frame = new JFrame("第四次作业");
    JCheckBox cb1 = new JCheckBox("英语");
    JCheckBox cb2 = new JCheckBox("高数");
    JCheckBox cb3 = new JCheckBox("计算机");
    JRadioButton rb4 = new JRadioButton("男");
    JRadioButton rb5 = new JRadioButton("女");
    JTextArea ta = new JTextArea(); //用于显示结果的文本区
    JTextArea tb = new JTextArea(); //用于写的文本区

    public static void main(String args[]) {
        demo4 ts = new demo4();
        ts.go();
    }

    public void go()
    {	JPanel p1 = new JPanel();//包含英语，高数，计算机复选框
        JPanel p4 = new JPanel();//包含性别单选按钮
        JPanel p6 = new JPanel();//写名字的文本区
        JPanel p5 = new JPanel();//文本区

  JPanel pb = new JPanel();

        /*把三个复选框添加到p1里，并设置边框*/
        p1.add(cb1);
        p1.add(cb2);
        p1.add(cb3);
        Border etched = BorderFactory.createEtchedBorder();
        Border border = BorderFactory.createTitledBorder(etched, "JCheckBox");
        p1.setBorder(border);


        //把两个单选按钮添加到p4里，并设置边框
        p4.add(rb4);
        p4.add(rb5);
        border = BorderFactory.createTitledBorder(etched, "JRadioButton Group" );
        p4.setBorder(border);
        ButtonGroup group2 = new ButtonGroup();//创建ButtonGroup按钮组，并在组中添加按钮
        group2.add(rb4);
        group2.add(rb5);

        //设置为写文本区p6添加滚动窗格，
        JScrollPane jp2 = new JScrollPane(tb);
        p6.setLayout(new BorderLayout());
        p6.add(jp2);
        border = BorderFactory.createTitledBorder(etched, "write");
        p6.setBorder(border);	//设置边框

        //设置为文本区p5添加滚动窗，
        JScrollPane jp = new JScrollPane(ta);
        p5.setLayout(new BorderLayout());
        p5.add(jp);
        border = BorderFactory.createTitledBorder(etched, "Results");
        p5.setBorder(border);	//设置边框


         // 添加键盘监听类
        tb.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                ta.setText(tb.getText());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                ta.setText(tb.getText());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                ta.setText(tb.getText());
            }
        });



        //为复选框，实现监听器接口，添加监听器
        ItemListener il = new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                JCheckBox cb = (JCheckBox) e.getSource();	//取得事件源
            if (cb == cb1) {
            ta.append("\n 英语"+ cb1.isSelected());
            }else if(cb == cb2){
            ta.append("\n 高数"+ cb2.isSelected());
            }else if(cb == cb3){
            ta.append("\n 计算机"+ cb3.isSelected());
            }
        }
        };
        cb1.addItemListener(il);
        cb2.addItemListener(il);
        cb3.addItemListener(il);


        //为单选按钮，实现监听器接口，添加监听器
        ItemListener al = new ItemListener () {
            public void itemStateChanged(ItemEvent e){
            JRadioButton rb = (JRadioButton) e.getSource();	//取得事件源
            if (rb == rb4) {
            ta.append("\n你选择了性别男"+ rb4.isSelected());
            } else if (rb == rb5){
            ta.append("\n你选择了性别女"+ rb5.isSelected());
            }
        }
        };
        rb4.addItemListener(al);
        rb5.addItemListener(al);


        Container cp = frame.getContentPane();
        cp.setLayout(new GridLayout(0,1));
        cp.add(p6);
        cp.add(p1);
        cp.add(p4);
        cp.add(p5);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}