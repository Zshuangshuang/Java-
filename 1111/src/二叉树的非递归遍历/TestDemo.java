package 二叉树的非递归遍历;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-11
 * Time: 20:02
 **/
public class TestDemo {

    public static void postOrder(TreeNode root){
        if (root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while(true){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            if (stack.isEmpty()){
                break;
            }
            TreeNode top = stack.pop();
            if (top.right == null || prev == top.right){
                System.out.print(top.val+" ");
                stack.pop();
                prev = top;
            }else {
                cur = top.right;
            }
        }
    }
    public static void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(true){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            if (stack.isEmpty()){
                break;
            }
            TreeNode top = stack.pop();
            System.out.print(top.val+"  ");
            cur = top.right;
        }
    }


    public static void prevOrder(TreeNode root){
//如果当前树为空树，直接返回
        if (root == null){
            return;
        }
        //创建一个栈，用来先序遍历
        Stack<TreeNode> stack = new Stack<>();
        //将根节点入栈
        stack.push(root);
        while(!stack.empty()){
            TreeNode top = stack.pop();
            //访问根节点
            System.out.print(top.val+"  ");
            //将右子树、左子树分别入栈
            if (top.right != null){
                stack.push(top.right);
            }
            if (top.left != null){
                stack.push(top.left);
            }
        }
    }

    public static void main(String[] args) {

    }
}
