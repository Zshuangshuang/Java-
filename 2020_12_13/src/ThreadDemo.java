import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Created with IntelliJ IDEA.
 * Description:饿汉模式
 * User: 14342
 * Date: 2020-12-13
 * Time: 12:55
 **/

public class ThreadDemo {
   static class Singleton{
        //定义为私有的构造方法，只允许类内访问
        private Singleton() {
        }
        //static修饰的变量，仅与类有关，与对象无关，且仅有一份
        private static Singleton singleton = new Singleton();

        //获取singleton实例的方法
        public static Singleton getSingleton() {
            return singleton;
        }
    }


    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton == singleton1);
    }

}
