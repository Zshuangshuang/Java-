/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-06
 * Time: 23:31
 **/
public class Test1 {
    static boolean out(char c){
        System.out.print(c);
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        for (out('A');out('B')&&(i<2);out('C')){
            i++;
            out('D');
        }
    }
}
