import java.awt.*;

public class Demo2  extends  Thread{

    Label l1 = new Label("标签1");
    Label l2 = new Label("标签2");
    Label l3 = new Label("标签3");
    Label l4 = new Label("标签4");

    public void run() {
        while (true){
            try {

                l1.setVisible(true);
                Thread.sleep(500);
                l1.setVisible(false);
                Thread.sleep(500);
                l2.setVisible(true);
                Thread.sleep(500);
                l2.setVisible(false);
                Thread.sleep(500);
                l3.setVisible(true);
                Thread.sleep(500);
                l3.setVisible(false);
                Thread.sleep(500);
                l4.setVisible(true);
                Thread.sleep(500);
                l4.setVisible(false);
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {

        Demo2 d1=new Demo2();
        Frame frame = new Frame("显示标签");

        frame.setBounds(500,400,300,200);
        frame.setLayout(new GridLayout(3,3,10,10));
        frame.add(d1.l1);
        frame.add(d1.l2);
        frame.add(d1.l4);
        frame.add(d1.l3);

        d1.start();
        frame.setVisible(true);

    }
}
