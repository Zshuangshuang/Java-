import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-09
 * Time: 8:59
 **/

class TreeNode{
    public TreeNode left;
    public TreeNode right;
    public int val;

    public TreeNode( int val) {
        this.left = null;
        this.right = null;
        this.val = val;
    }
}
public class TestTree {

    public void levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null){
            return ;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            System.out.print(cur.val+"  ");
            if (cur.left != null){
                queue.offer(cur.left);
            }
            if (cur.right != null){
                queue.offer(cur.right);
            }
        }
    }

    public boolean isSymmetric(TreeNode root){
        if (root == null){
            return true;
        }
        return isMioor(root.left,root.right);
    }

    private boolean isMioor(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null){
            return true;
        }
        if (t1 == null || t2 == null){
            return false;
        }
        if (t1.val != t2.val){
            return false;
        }
        return isMioor(t1.right,t2.left) && isMioor(t1.left,t2.right);
    }

    public boolean isBalancedTree(TreeNode root){
        if (root == null){
            return true;
        }
        if (root.left == null && root.right == null){
            return true;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        if (leftDepth-rightDepth > 1 || leftDepth-rightDepth < -1){
            return false;
        }
        return isBalancedTree(root.left) && isBalancedTree(root.right);
    }

    public int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
    public boolean isSubTree(TreeNode s,TreeNode t){
        if (s == null && t == null){
            return true;
        }
        if (s == null || t == null){
            return false;
        }
        boolean ret = false;
        if (s.val == t.val){
            ret = isSameTree(s,t);
        }
        return ret || isSubTree(s.left,t) || isSubTree(s.right,t);
    }

    public boolean isSameTree(TreeNode A,TreeNode B){
        if (A == null && B == null){
            return true;
        }
        if (A == null || B == null){
            return false;
        }
        if (A.val != B.val){
            return false;
        }
        return isSameTree(A.left,B.left) && isSameTree(A.right,B.right);
    }
    public List<Integer> postOrder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        result.addAll(postOrder(root.left));
        result.addAll(postOrder(root.right));
        result.add(root.val);
        return result;
    }

    public List<Integer> inOrder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        result.addAll(inOrder(root.left));
        result.add(root.val);
        result.addAll(inOrder(root.right));
        return result;
    }

    public List<Integer> prevOrder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        result.add(root.val);
        result.addAll(prevOrder(root.left));
        result.addAll(prevOrder(root.right));
        return result;
    }
    public TreeNode buildTree(){
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        a.left = b;
        a.right = c;
        b.left = d;
        return a;
    }
}
