/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-05
 * Time: 12:50
 **/
public class MyLinkedList {
    static class Node{
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public Node head;
    private int size(){
        Node cur = head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    public int get(int index) {
        if (index < 0 || index >= size()){
            return -1;
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }
    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (head == null){
            head = node;
            return;
        }
        Node cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    }
    private Node findIndex(int index){
        Node cur = head;
        for (int i = 0; i < index-1; i++) {
            cur = cur.next;
        }
        return cur;
    }
    public void addAtIndex(int index, int val) {
        if (index == 0){
            addAtHead(val);
            return;
        }
        if (index == size()){
            addAtTail(val);
            return;
        }
        if (index < 0 || index > size()){
            return;
        }
        Node node = new Node(val);
        Node prev = findIndex(index);
        node.next = prev.next;
        prev.next = node;

    }
    public void deleteAtIndex(int index) {
        if (index <0 || index >= size()){
            return;
        }
        if (index == 0){
            head = head.next;
            return;
        }
        Node prev = findIndex(index);
        Node del = prev.next;
        prev.next = del.next;

    }


public void display(){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
    System.out.println();
}
}
