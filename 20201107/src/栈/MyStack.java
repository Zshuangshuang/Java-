package 栈;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-07
 * Time: 13:34
 **/
public class MyStack {
    //给数组设置初始化初始容量
    private int[] elem = new int[100];
    //数组的有效长度
    private int size;
    //入栈操作
    public void push(int x){
        elem[size] = x;
        size++;
    }
    //出栈操作
    public Integer pop(){
        //如果当前为空栈，世界返回null
        if (size == 0){
            return null;
        }
        //通过下标找到当前的栈顶元素
        int ret = elem[size-1];
        size--;
        return ret;
    }
    //取栈顶元素
    public Integer peek(){
        if (size == 0){
            return null;
        }
        return elem[size-1];

    }
}
