package 二叉树面试题;

import 二叉树.BuildTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-10
 * Time: 8:16
 **/

class TreeNode{
    public TreeNode left;
    public TreeNode right;
    public int val;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class TestInterviewTree {
    public boolean isCompleteTree(TreeNode root){
        if (root == null){
            return  true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        //将树的根节点入队列，开始层序遍历
        queue.offer(root);
        //此处的tmp为标志位，用来区分完全二叉树的第一阶段和第二阶段
        boolean tmp = false;
        while(!queue.isEmpty()){
            //定义cur为书的根节点
            TreeNode cur = queue.poll();
            //判断当前是第一阶段还是第二阶段
           if (!tmp){
               if (cur.left != null && cur.right != null){
                   queue.offer(cur.left);
                   queue.offer(cur.right);
               }else if(cur.left != null && cur.right == null){
                   queue.offer(cur.left);
                   tmp = true;
               }else if(cur.left == null && cur.right != null){
                   return false;
               }else {
                   tmp = true;
               }
           }
           //进入第二阶段
           else {
               if (cur.left != null || cur.right != null ){
                   return false;
               }
           }
        }
        return true;
    }
    private static List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null){
            return result;
        }
        helper(root,0);
        return result;
    }

    private void helper(TreeNode root, int level) {
        if (level == result.size()){
            result.add(new ArrayList<>());
        }
        List<Integer> row = result.get(level);
        row.add(root.val);
        if (root.left != null){
            helper(root.left,level+1);
        }
        if (root.right != null){
            helper(root.right,level+1);
        }
    }

}
