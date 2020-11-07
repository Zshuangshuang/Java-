package 二叉树;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-07
 * Time: 14:31
 **/
 class Node{
    public char val;
    public Node left;
    public Node right;

    public Node( char val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

}

public class TestTree {

public static Node createTree(){
    Node a = new Node('A');
    Node b = new Node('B');
    Node c = new Node('C');
    Node d = new Node('D');
    Node e = new Node('E');
    Node f = new Node('F');
    Node g = new Node('G');
    Node h = new Node('H');
    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    c.left = f;
    e.left = g;
    g.right = h;
    return a;
}
    public static void prevOrder(Node root){
    if (root == null){
        return;
    }
        System.out.print(root.val+"  ");
        prevOrder(root.left);
        prevOrder(root.right);

    }
    public static void invOrder(Node root){
    if (root == null){
        return;
    }
    invOrder(root.left);
    System.out.print(root.val+"  ");
    invOrder(root.right);
    }

    public static void pastOrder(Node root){
        if (root == null){
            return;
        }
        pastOrder(root.left);
        pastOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static int size(Node root){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        return 1+size(root.left)+size(root.right);
    }
    public static int leafSize(Node root){
    if (root == null){
        return 0;
    }
    if (root.right == null && root.left == null){
        return 1;
    }
    return leafSize(root.right)+leafSize(root.left);

}
public static int kLevelSize(Node root,int k){
    if (k < 1 ||root == null){
        return 0;
    }
    if (k == 1){
        return 1;
    }
    return kLevelSize(root.left,k-1)+kLevelSize(root.right,k-1);
}
public static Node find(Node root,char toFind){
    if (root == null){
        return null;
    }
    if (root.val == toFind){
        return root;
    }
    Node ret = find(root.left,toFind);
    if (ret != null){
        return ret;
    }
    return find(root.right,toFind);
}

    public static void main(String[] args) {
        Node node = createTree();
        System.out.println("先序遍历：");
        prevOrder(node);
        System.out.println();
        System.out.println("中序遍历:");
        invOrder(node);
        System.out.println();
        System.out.println("后序遍历：");
        pastOrder(node);
        System.out.println();
        int ret = size(node);
        System.out.println(ret);
        int x = leafSize(node);
        System.out.println(x);
    }
}
