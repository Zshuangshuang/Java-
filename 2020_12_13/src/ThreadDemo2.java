/**
 * Created with IntelliJ IDEA.
 * Description:懒汉模式，需要考虑到线程安全和性能问题；
 * 加锁之后与高性能你无缘
 * User: 14342
 * Date: 2020-12-13
 * Time: 13:15
 **/
public class ThreadDemo2 {
    static class Singleton{
        private Singleton(){

        }
        //解决内存可见性问题
        private volatile Singleton singleton = null;

        public Singleton getSingleton() {
            //优化性能
            if (singleton == null) {
                //解决线程安全问题
                synchronized (Singleton.class) {
                    if (singleton == null){
                        singleton = new Singleton();
                    }
                }
            }
            return singleton;
        }
    }
}
