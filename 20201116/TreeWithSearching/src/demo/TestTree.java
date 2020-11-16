package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-16
 * Time: 7:48
 **/
class Node{
    public int key;
    public Node left;
    public Node right;

    public Node(int key) {
        this.key = key;
    }
public class TestTree {
        public Node root = null;
        //查找元素：类似于二分查找
        public Node find(int key){
            //如果当前根节点是null,世界返回Null
            if (root == null){
                return null;
            }
            //定义一个cur指向根节点去遍历二叉搜索树
            Node cur = root;
            while(cur != null){
                //如果说待查找元素小于当前节点的值，那么就往左找
                //如果说待查找元素大于当前节点，就向右找
                if (key < cur.key){
                    cur = cur.left;
                }else  if (key > cur.key){
                    cur = cur.right;
                }else {
                    return  cur;
                }

            }
            //当遍历完整个二叉搜索树时，还未发现该节点，那么就说明此二叉搜索树没有这个值
            return null;

        }
        //二叉搜索树中不能有重复的元素，如果有重复元素要插入，那么就会插入失败，所以这里的返回值类型是布尔类型
        public boolean insert(int key){
            //空树就直接插入
            if (root == null){
                root = new Node(key);
                return true;
            }
            //定义一个parent节点，始终是当前节点的双亲结点，相当于单链表中的前驱节点
            Node cur = root;
            Node parent = null;
            //搜索二叉树的插入是在尾巴进行的
            while(cur != null){
                //要插入的元素小于当前节点，那么就往左找；大于当前元素就往右找
                if (key < cur.key){
                    parent = cur;
                    cur = cur.left;
                }else if(key > cur.key){
                    parent = cur;
                    cur = cur.right;
                }else {
                    return false;
                }
            }
            //找到要插入节点的父节点，此时要待插入的节点的值和父节点的值，谁大；
            //若父节点的值大于要插入元素的值，那么往父节点的左子树插入，否则插入右子树
            if (key < parent.key){
                parent.left = new Node(key);
            }else {
                parent.right = new Node(key);
            }
            return true;
        }

    }
}
