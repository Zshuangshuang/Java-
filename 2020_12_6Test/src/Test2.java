/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-06
 * Time: 23:36
 **/
public class Test2 {

    public static void main(String[] args) {
        int x = 20;
        int y = 30;
        boolean b;
        b = x>50 && y>60 || x>50 && y<-60 || x<-50 && y>60 || x<-50 && y<-60;
        System.out.println(b);
    }
}
