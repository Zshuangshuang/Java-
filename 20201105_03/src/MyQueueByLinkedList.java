/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-05
 * Time: 12:06
 **/
public class MyQueueByLinkedList {
    static class Node{
        public Node next;
        public int data;

        public Node( int data) {
            this.next = null;
            this.data = data;
        }
    }
    public Node head;
    public Node tail;
    //入队列:offer
    public void offer(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = tail.next;
        return;

    }
    //出队列:poll
    public Integer poll(){
        if (head == null){
            return  null;
        }
        int ret = head.data;
        head = head.next;
        if (head == null){
            tail = null;
        }
        return ret;
    }
    //取队首元素:peek
    public Integer peek(){
        if (head == null){
            return null;
        }
        return head.data;
    }


}
