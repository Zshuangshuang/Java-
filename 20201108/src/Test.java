/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-08
 * Time: 9:00
 **/
class TreeNode{
    public TreeNode left;
    public TreeNode right;
    public char data;

    public TreeNode( char data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }
}
public class Test {
    public static TreeNode buildTree(){
        TreeNode a = new TreeNode('A');
        TreeNode b = new TreeNode('B');
        TreeNode c = new TreeNode('C');
        TreeNode d = new TreeNode('D');
        TreeNode e = new TreeNode('E');
        TreeNode f = new TreeNode('F');
        TreeNode g = new TreeNode('G');
        TreeNode h = new TreeNode('H');
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        e.left = g;
        g.right = h;
        return a;
    }
    public static void prevOrder(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print(root.data+"  ");
        prevOrder(root.left);
        prevOrder(root.right);
    }
    public static void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+"  ");
        inOrder(root.right);
    }
    public static void pastOrder(TreeNode root){
        if (root == null){
            return;
        }
        pastOrder(root.left);
        pastOrder(root.right);
        System.out.print(root.data+"  ");
    }
public static int size(TreeNode root){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        return 1+size(root.left)+size(root.right);
}
public static int leafSize(TreeNode root){
        if (root == null){
            return 0;
        }
if(root.left == null && root.right == null){
    return 1;
}
return leafSize(root.left) + size(root.right);
}
public int kLevelSize(TreeNode root,int k){
        if (k < 1 || root == null){
            return 0;
        }
        if (k == 1){
            return 1;
        }
        return kLevelSize(root.left,k-1)+kLevelSize(root.right,k-1);

}
public static TreeNode find(TreeNode root,char toFind){
        if (root == null){
            return null;
        }
        if (root.data == toFind){
            return root;
        }
        TreeNode ret = find(root.left,toFind);
        if (ret != null){
            return ret;
        }
        return find(root.right,toFind);

}
    public static void main(String[] args) {
        TreeNode root = buildTree();
        prevOrder(root);

    }

}
