import com.sun.media.jfxmediaimpl.HostUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-20
 * Time: 12:26
 **/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String[] ret = s.split(" ");
        Double a = Double.parseDouble(ret[0]);
        Double b = Double.parseDouble(ret[1]);
        Double c = Double.parseDouble(ret[2]);
        calculate(a,b,c);
    }
    public static void calculate(double a,double b,double c){
        double ret = b*b-4*a*c;
        if (a != 0){
            if (ret == 0){
                System.out.println("x1=x2"+String.format("%.2f",-b/2/a));
            }else if(ret > 0){
                double x1 = (-b-Math.sqrt(ret))/2/a;
                double x2 = (-b+Math.sqrt(ret))/2/a;
                System.out.println(String.format("x1=%.2f;x2=%.2f",x1,x2));
            }else{
                double realPart = (-b)/2/a;
                double viralPart = Math.sqrt(-ret)/2/a;
                System.out.println(String.format("x1=%.2f-%2.fi;x2=%.2f+%.2fi",realPart,viralPart,realPart,viralPart));
            }

        }else{
            System.out.println("Not quadratic equation");
        }

    }
}
