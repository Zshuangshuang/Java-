/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-05
 * Time: 12:00
 **/
public class MyStack {
    //初始容量
    private int[] array = new int[100];
    //一共有多少个有效元素
    private int size;
    //入栈:push
    public void push(int x){
        array[size] = x;
        size++;
    }
    //出栈：pop
    public int pop(){
        int ret = array[size-1];
        size--;
        return ret;
    }
    //取栈顶元素：peek
    public int peek(){
        return array[size-1];
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }

}
