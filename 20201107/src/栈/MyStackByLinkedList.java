package 栈;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-07
 * Time: 13:40
 **/
public class MyStackByLinkedList {
    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //创建一个傀儡节点
    public Node head = new Node(-1);
    //入栈：头插法
    public void push(int x){
        //创建一个要插入的节点
        Node node = new Node(x);
        node.next = head.next;
        head.next = node;
    }
    //出栈：头删
    public Integer pop(){
        //toDel表示栈顶元素
        Node toDel = head.next;
        //如果栈顶元素为空，直接返回Null
        if (toDel == null){
            return null;
        }
        //开始删除
        head.next = toDel.next;
        //返回栈顶元素
        return toDel.data;
    }
    public Integer peek(){
        //如果栈为空，直接返回Null
        if (head.next == null){
            return null;
        }
        return head.next.data;
    }
}
