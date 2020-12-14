/**
 * Created with IntelliJ IDEA.
 * Description:饿汉模式
 * User: 14342
 * Date: 2020-12-14
 * Time: 18:46
 **/
public class ThreadDemo {
    static class SingleTon{
        //定义一个私有的构造方法，只允许类内访问
        private SingleTon(){

        }
        //定义一个私有的静态对象，有且仅有一份
        private static SingleTon singleTon = new SingleTon();
        //定义一个私有的获取singleton对象的方法，仅允许类内访问
        private SingleTon getSingleTon(){
            return singleTon;
        }
    }
}
