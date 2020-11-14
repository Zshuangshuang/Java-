package 二叉树复习题;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-10
 * Time: 17:07
 **/
public class levelOrder {
    static class TreeNode{
        public TreeNode left;
        public TreeNode right;
        public int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }
     List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrdered(TreeNode root){
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
