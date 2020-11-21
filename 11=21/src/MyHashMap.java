/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-21
 * Time: 19:43
 **/
public class MyHashMap {
    static class Node{
        public int key;
        public int value;
        public Node next;
        public Node[] array;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    public Node[] array = new Node[101];
    //表示当前哈希表元素的个数
    public int size = 0;
    //负载因子
    public final double LOAD_FACTOR = 0.75;
    public int hashFunc(int key){
        return key%array.length;
    }
    public void put(int key,int value){
        //1、通过哈希函数找到哈希值,也就是将key通过hash函数映射成数组下标
        int index = hashFunc(key);
        //2、通过下标找到相应的链表
        Node list = array[index];
        for (Node cur = list; cur != null ; cur = cur.next) {
            if (cur.key == key){
                cur.value = value;
                return;
            }

        }
        Node newNode = new Node(key,value);
        newNode.next = list;
        array[index] = newNode;
        size++;
        if (size%array.length > LOAD_FACTOR){
            resize();
        }
    }

    private void resize() {
        Node[] newArray = new Node[array.length*2];
        for (int i = 0; i < newArray.length; i++) {
            for (Node cur = array[i]; cur!=null ; cur=cur.next) {
                    int index = cur.key %newArray.length;
                    Node newNode = new Node(cur.key,cur.value);
                    newNode.next = newArray[index];
                    newArray[index] = newNode;
            }
        }
        array = newArray;
    }

    public Integer find(int key){
        //先将要查找的值经过哈希，得到数组下标
        int index = hashFunc(key);
        //根据下标找到对应的链表
        Node list = array[index];
        //遍历当前链表，如果找到了就返回该节点的值，找不到就返回null
        for (Node cur = list; cur != null ; cur = cur.next) {
            if (cur.key == key){
                return cur.value;
            }
        }
        return  null;
    }
}
