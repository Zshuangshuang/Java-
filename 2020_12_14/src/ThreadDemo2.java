/**
 * Created with IntelliJ IDEA.
 * Description:懒汉模式
 * User: 14342
 * Date: 2020-12-14
 * Time: 18:52
 **/
public class ThreadDemo2 {
    static class SingleTon{
        private SingleTon(){

        }
        private static volatile SingleTon singleTon = new SingleTon();
        private  SingleTon getSingleTon(){
            if (singleTon == null){
                synchronized (SingleTon.class) {
                    if (singleTon == null){
                        singleTon = new SingleTon();
                    }
                }
            }
            return singleTon;
        }
    }
}
