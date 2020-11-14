package 复习二叉树面试题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-10
 * Time: 10:53
 **/
class TreeNode{
    public TreeNode left;
    public TreeNode right;
    public char val;

    public TreeNode(char val) {
        this.val = val;
    }
}
public class TestTreePreview {
    //(1)二叉树的构建以及遍历
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String line = scanner.next();
            TreeNode root = buildTree(line);
            inOrder(root);
            System.out.println();
        }
    }

    private static void inOrder(TreeNode root) {
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    private static int index = 0;
    private static TreeNode buildTree(String line) {
        index = 0;
        return createTreeByPrevOrder(line);

    }

    private static TreeNode createTreeByPrevOrder(String line) {
        char cur = line.charAt(index);
        index++;
        if (cur == '#'){
            return null;
        }
        TreeNode root = new TreeNode(cur);

        root.left = createTreeByPrevOrder(line);

        root.right = createTreeByPrevOrder(line);

        return root;
    }

}
