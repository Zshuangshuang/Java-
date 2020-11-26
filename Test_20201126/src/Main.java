import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-26
 * Time: 22:56
 **/
public class Main {
    public static int beiBao(int[] array,int n,int v,int index ){
        if (v == 0){
            return 1;
        }
        if (n == 0){
            return 0;
        }
        return beiBao(array,n-1,v-array[index],index+1)+beiBao(array,n-1,v,index+1);
    }
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while(scanner.hasNext()){
                int num = scanner.nextInt();
                int[] array = new int[num];
                for (int i = 0; i < num; i++) {
                    array[i] = scanner.nextInt();
                }
                System.out.println(beiBao(array, num, 40, 0));
            }

    }

}
