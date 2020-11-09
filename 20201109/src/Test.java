/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-09
 * Time: 9:22
 **/
public class Test {
    public static void main(String[] args) {
        TestTree testTree = new TestTree();
        TreeNode root = testTree.buildTree();
        testTree.levelOrder(root);

    }
}
