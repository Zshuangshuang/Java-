package 二叉树的非递归遍历;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-11
 * Time: 19:27
 **/

class TreeNode{
    public TreeNode left;
    public TreeNode right;
    public int val;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class TestTree {
    public static void prevOrder(TreeNode root){
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        while(!stack.isEmpty() || cur != null){
            while(cur != null){
                System.out.print(cur.val+"  ");
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack.pop();
            cur = top.right;
        }
    }
    public static void inOrder(TreeNode root){
        Deque<TreeNode > stack = new LinkedList<>();
        TreeNode cur = root;
        while(!stack.isEmpty() || cur != null){
            while(cur != null){

                stack.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack.pop();
            System.out.print(top.val+"  ");
            cur = top.right;
        }
    }

    public static void postOrder(TreeNode root){
        Deque<TreeNode > stack = new LinkedList<>();
        TreeNode cur = root;
        TreeNode last = null;
        while(!stack.isEmpty() || cur != null){
            while(cur != null){

                stack.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack.peek();
            if (top.right == null){
                stack.pop();
                last = top;
                System.out.println(top.val);
            }else if(top.right == last){
                stack.pop();
                last = top;
                System.out.println(top.val);
            }else {
                cur = top.right;
            }
        }
    }


}
