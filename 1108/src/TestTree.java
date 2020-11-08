import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-08
 * Time: 20:31
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
        //思路：(1)创建一个队列
        //(2)将根节点入队列;
        //(3)若当前的队列不是空队列，则将根节点出队列，并打印该节点
        //(4)若当前节点的左子树不为空，则将其入队列
        //(5)若当前节点的右子树不为空，则将其入队列
        Queue<TreeNode> queue = new LinkedList<>();
        while(!queue.isEmpty()){
            queue.offer(root);
            TreeNode cur = queue.poll();
            System.out.print(cur.val+"  ");
            if (cur.left != null){
                queue.offer(root.left);
            }
            if (cur.right != null){
                queue.offer(root.right);
            }
        }
    }
    public boolean isSymmetric(TreeNode root) {
        //思路：(1)判断当前树是不是空树，若为空树，则返回true;
        //(2)判断两棵树是不是镜像对称
        if (root == null){
            return true;
        }
        return isMioor(root.left,root.right);

    }

    private boolean isMioor(TreeNode t1, TreeNode t2) {
        //思路：(1)判断当前树是不是空树，若是空树则返回true;
        //(2)判断当前树的左右子树是不是只有一个是null，若是，则返回false;
        //(3)判断当前t1,t2的根节点值是否相同
        //递归判断当前t1的左子树和t2的右子树是否镜像对称&&t1的右子树和t2的左子树是否镜像对称
        if (t1 == null && t2 == null){
            return true;
        }
        if (t1 == null || t2 == null){
            return false;
        }
        if (t1.val != t2.val){
            return false;
        }
        return isMioor(t1.left,t2.right) && isMioor(t1.right,t2.left);

    }

    public boolean isBalanced(TreeNode root) {
        //思路：(1)如果当前是空树，则为平衡二叉树;
        //(2)如果当前树只有一个节点，则是平衡二叉树
        //(3)求当前树的左右子树的高度差是否大于1，若大于1，则返回false;
        //(4)递归判定当前树的左子树、右子树是否为平衡二叉树
        if (root == null){
            return true;
        }
        if (root.left == null && root.right == null){
            return true;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        if (leftDepth-rightDepth > 1  || leftDepth-rightDepth < -1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);

    }
    public int maxDepth(TreeNode root) {
        //思路:(1)判断root是否为空，若为空，则世界返回0；
        //(2)判断当前节点是否为叶子节点，若为叶子节点世界返回1
        //(3)返回左右字数节点的最大值+1；
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));

    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        //思路：(1)如果两棵树均为空树，则返回true;
        //(2)如果仅有一棵树为null，直接返回false;
        //(3)判断两棵树是否相等
        //(4)若两棵树不相等，则递归访问左、右子树，判断s是否包含t
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
        return  ret || isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        //思路：(1)如果两棵树都为空树，那么两棵树相同，返回true；
        //(2)若一棵为空，一棵不为空，返回false；
        //(3)如果都不为空，那么判断根节点的值是否相同，不同直接返回false;
        //(4)递归判断左子树和右子树
        if (p == null && q == null){
            return true;
        }
        if (p == null || q == null){
            return false;
        }
        if (p.val != q.val){
            return false;
        }
        return  isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        result.addAll(postorderTraversal(root.left));
        result.addAll(postorderTraversal(root.right));
        result.add(root.val);
        return result;

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;

    }


}
