public class _104_MaximumDepthOfBinaryTree {

    //Input: root = [3,9,20,null,null,15,7]
    //Output: 3
    //
    //Найти максимальную глубину дерева (количество узлов к нему)
    public static void main(String[] args) {
        TreeNode treeNode5 = new TreeNode(7, null, null);
        TreeNode treeNode4 = new TreeNode(15, null, null);
        TreeNode treeNode3 = new TreeNode(20, treeNode4, treeNode5);
        TreeNode treeNode2 = new TreeNode(9, null, null);
        TreeNode treeNode1 = new TreeNode(3, treeNode2, treeNode3);

        System.out.println(maxDepth(treeNode1)); //3
    }

    //O(n) //O(n)
    private static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    private static class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;

        private TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
