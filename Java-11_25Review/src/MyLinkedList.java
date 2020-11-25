/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-25
 * Time: 20:21
 **/

class Node{
    public Node next;
    public int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {
    public Node head;
   public boolean isHuiWen(){
       //首先定义fast和slow两个指针，让他们找到中间节点
      Node fast = head;
      Node slow = head;
      while(fast.next != null  && fast != null){
          fast = fast.next.next;
          slow = slow.next;
      }
      //将中间节点的右半部分逆置
      Node cur = slow.next;
      while(cur != null){
          Node curNext = cur.next;
          cur.next = slow;
          slow = cur;
          cur = curNext;
      }
      while(head != slow){
          if (head.data != slow.data){
              return false;
          }
          //偶数情况
          if (head.next == slow){
              return true;
          }
          slow = slow.next;
          head = head.next;
      }
      return true;
   }
}
