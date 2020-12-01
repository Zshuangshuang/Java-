/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-01
 * Time: 22:54
 **/

public class Main1 {
    String str = "hello";
    char[] ch = {'a','b'};

    public static void main(String[] args) {
        Main1 main1 = new Main1();
        main1.change(main1.str,main1.ch);
        System.out.println(main1.str+" and ");
        System.out.println(main1.ch);
    }
    public void change(String str,char[] ch){
        str = "test ok";
        ch[0] = 'c';
    }
}
