import util.TreeNode;

public class _104_MaximumDepthOfBinaryTree {

    private static final TreeNode NODE_5 = new TreeNode(7, null, null);
    private static final TreeNode NODE_4 = new TreeNode(15, null, null);
    private static final TreeNode NODE_3 = new TreeNode(20, NODE_4, NODE_5);
    private static final TreeNode NODE_2 = new TreeNode(9, null, null);
    private static final TreeNode NODE_1 = new TreeNode(3, NODE_2, NODE_3);

    //Input: root = [3,9,20,null,null,15,7]
    //Output: 3
    //
    //Найти максимальную глубину дерева (количество узлов к нему)
    public static void main(String[] args) {
        System.out.println(maxDepth(NODE_1)); //3
    }

    //O(n) //O(n)
    private static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
