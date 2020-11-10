package 二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-10
 * Time: 8:59
 **/
public class BuildTree {

    static class TreeNode{
      public TreeNode left;
      public TreeNode right;
      public char val;

        public TreeNode(char val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //循环读取数据
        while(scanner.hasNext()){
            String line = scanner.next();
            //创建树的方法：
            TreeNode root = build(line);
            System.out.println();
        }
    }
    //表示访问到第几个字符
    private static int index = 0;
    private static TreeNode build(String line) {
        index = 0;
        return createTreePrevOrder(line);
    }
//通过线序遍历的方法构建树
    private static TreeNode createTreePrevOrder(String line) {
        //取出line中的index位置元素作为书的节点
        char cur  = line.charAt(index);
        //如果cur = ‘#’那么证明当前的cur是Null
        if (cur == '#'){
            return null;
        }
        //创建一个节点，将cur的值赋给它，即作为一个根节点放到树中
        TreeNode root = new TreeNode(cur);
        index++;
        //创建根节点的左子树
        root.left = createTreePrevOrder(line);
        index++;
        //创建根节点的右子树
        root.right = createTreePrevOrder(line);
        index++;
        return root;
    }

}
