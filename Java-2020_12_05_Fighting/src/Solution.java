import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * User: 14342
 * Date: 2020-12-05
 * Time: 22:17
 **/
class ListNode{
    public int val;
    public ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}
public class Solution {
    //方法(2):递归
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
      if (listNode != null){
          printListFromTailToHead(listNode.next);
          list.add(listNode.val);
      }
      return list;
    }
    //方法(1):非递归
    /*public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode cur = listNode;
        while(cur != null){
            list.add(0,cur.val);
            cur = cur.next;
        }
        return list;
    }*/
}
