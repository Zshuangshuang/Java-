/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-05
 * Time: 13:10
 **/
public class Test {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(5);
        myLinkedList.display();
        myLinkedList.addAtIndex(1,2);
        myLinkedList.display();
        System.out.println(myLinkedList.get(1));
    }
}
