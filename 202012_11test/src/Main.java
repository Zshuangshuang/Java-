/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-11
 * Time: 20:09
 **/
public class Main {
    public static void main(String[] args) {
        double moSR = 0.0;
        double richMan = 0.0;
        double ret = 0.1;
        java.text.NumberFormat nf = java.text.NumberFormat.getInstance();
        nf.setGroupingUsed(false);
        for (int i = 1; i < 31; i++) {
            richMan += 100000;
            moSR += ret;
            System.out.println(": 百万富翁得到：" + richMan + '\t' + "陌生人得到：" +moSR);
            ret = ret*2;
        }
    }
}
