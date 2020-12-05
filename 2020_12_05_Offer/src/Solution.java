/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-05
 * Time: 18:56
 **/
public class Solution {
    public String replaceSpace(StringBuffer str) {
       /* return str.toString().replace(" ","%20");*/
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' '){
                stringBuffer.append("%20");
            }else {
                stringBuffer.append(ch);
            }
        }
        return stringBuffer.toString();
    }
}
