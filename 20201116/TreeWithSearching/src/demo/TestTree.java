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
public static class TestTree {
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

     public boolean remove(int key){
            if (root == null){
                return false;
            }
            Node cur = root;
            Node parent = null;
            if (key < cur.key){
                parent = cur;
                cur = cur.left;
            }else if (key > cur.key){
                parent = cur;
                cur= cur.right;
            }else {
                removeNode(parent,cur);
                return true;
            }
            return false;
     }

    private void removeNode(Node cur, Node parent) {
            //1、如果当前要删除的元素没有左子树
            if (cur.left == null){
                //1.1 当前的要删除的节点就是根节点，由于没有左子树，那么只能让根节点指向右子树
                if (cur == root){
                   root = cur.right;
                }else if(cur == parent.left){
                   parent.left = cur.right;
                }else {
                    parent.right = cur.right;
                }
            }else if (cur.right == null){
                if (cur == root){
                    root = cur.left;
                }else if(cur == parent.left){
                    parent.left = cur.left;
                }else {
                   parent.right = cur.left;
                }

            }else {
                //当前要删除的节点，既有左子树又有右子树。那么先找到右子树中的最小值取替换它
                Node goatParent = cur;
                Node scapeGoat = cur.right;

                while(scapeGoat.left != null){
                    goatParent = scapeGoat;
                    scapeGoat = scapeGoat.left;
                }
                cur.key = scapeGoat.key;
                if (goatParent.left == scapeGoat){
                        goatParent.left = scapeGoat.right;
                }else {
                    goatParent.right = scapeGoat.right;
                }
            }
    }
    public void prevOrder(Node root){
            if (root == null){
                return;
            }
        System.out.print(root.key+" ");
            prevOrder(root.left);;
            prevOrder(root.right);
    }
    public void inOrder(Node root){
            if (root == null){
                return;
            }
            inOrder(root.left);
        System.out.print(root.key+" ");
        inOrder(root.right);
    }


}

    public static void main(String[] args) {
        TestTree testTree = new TestTree();
        testTree.insert(9);
        testTree.insert(5);
        testTree.insert(2);
        testTree.insert(7);
        testTree.insert(3);
        testTree.insert(6);
        testTree.insert(8);
        /*testTree.inOrder(testTree.root);
        System.out.println();
        testTree.prevOrder(testTree.root);*/
        testTree.remove(5);
        System.out.println();
        testTree.inOrder(testTree.root);
    }
}
