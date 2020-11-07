package 队列;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-07
 * Time: 13:51
 **/
public class MyQueue {
    static class Node{
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        //单链表的头
        public Node head;
        //单链表的尾巴
        public Node tail;
        //入队列
        public void offer(int x){
            //创建一个要插入的节点
            Node node = new Node(x);
            //进行尾插
            tail.next = node;
            tail = tail.next;
        }
        //出队列
        public Integer poll(){
            //如果当前链表为空，直接返回Null
            if (head == null){
                return null;
            }
            //进行删除操作
            head = head.next;
            //如果当前队列为空，将tail也变为Null
            if (head == null){
                tail = head;
            }
            return head.data;
        }
        public Integer peek(){
            if (head == null){
                return null;
            }
            return head.data;
        }
    }
}
