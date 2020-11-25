import java.util.Scanner;


public class HuiWen {
    public static boolean isHuiWen(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            //左右位置元素不相同，直接返回false
           if (str.charAt(left) != str.charAt(right)){
               return false;
           }
           left++;
           right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            //计数器count
            int count = 0;
            for (int i = 0; i <= str1.length(); i++) {
                //将str1变为可变字符串
                StringBuilder str = new StringBuilder(str1);
                //将str2从0位置依次插入str
                str.insert(i,str2);
                //判断str是否为回文结构
                if (isHuiWen(str.toString())){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
