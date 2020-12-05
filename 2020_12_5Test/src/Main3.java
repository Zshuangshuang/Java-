import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-05
 * Time: 17:30
 **/
class TDate{
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public TDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int date = scanner.nextInt();
        TDate tDate = new TDate(year,month,date);
        System.out.println(tDate.getDay()+"/"+tDate.getMonth()+"/"+tDate.getYear());
    }
}
