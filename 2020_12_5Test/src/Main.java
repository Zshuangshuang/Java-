import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-05
 * Time: 17:47
 **/
class Shape{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



}
class Rectangle extends Shape{
    private int chang;
    private int kuaN;

    public int getChang() {
        return chang;
    }

    public void setChang(int chang) {
        this.chang = chang;
    }

    public int getKuaN() {
        return kuaN;
    }

    public void setKuaN(int kuaN) {
        this.kuaN = kuaN;
    }
    public Rectangle(int chang,int kuaN){
        this.chang = chang;
        this.kuaN = kuaN;
    }
    public int getArea(){
        return chang*kuaN;
    }

}
class Circle extends Shape{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }
    public double getArea(){
        return r*r*3.14;
    }
}
class Square extends Rectangle{
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Square(int length) {
        super(length,length);
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            Rectangle rectangle = new Rectangle(scanner.nextInt(),scanner.nextInt());
            Circle circle = new Circle(scanner.nextDouble());
            Square square = new Square(scanner.nextInt());
            System.out.println(rectangle.getArea());
            double ret = circle.getArea();
            double tmp = ret-(int)ret;
            if (tmp == 0.0){
                System.out.println((int)ret);
            }else {
                System.out.println(ret);
            }
            System.out.println(square.getArea());
        }
    }

}
