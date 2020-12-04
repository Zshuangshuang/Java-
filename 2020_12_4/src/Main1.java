import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-04
 * Time: 13:06
 **/
public class Main1 {




        public static void main(String[] args) {
           Scanner sc;
            sc = new Scanner(System.in);
            String str;        //把输入的数字以字符串形式保存
            char[] ch;
            int a[]=new int[10];	//用于存放各位数出现的次数，其中索引代表该数

            str=sc.next();
            ch=str.toCharArray();		//将字符串转换成字符数组保存
            for(int i=0;i<ch.length;i++){
                a[(int)ch[i]-48]+=1;
            }

            for(int i=0;i<a.length;i++){
                if(a[i]!=0){
                    System.out.println(i+":"+a[i]);
                }
            }
        }
    }

