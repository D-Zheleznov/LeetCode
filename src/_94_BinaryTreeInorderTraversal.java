import java.util.ArrayList;
import java.util.List;

public class _94_BinaryTreeInorderTraversal {

    //Input: root = [1,null,2,3]
    //
    //Неупорядоченный обход узлов дерева
    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node1 = new TreeNode(1, null, node2);

        System.out.println(inorderTraversal(node1)); //[1,3,2]
    }

    //O(n) //O(n)
    private static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        count(list, root);
        return list;
    }

    private static void count(List<Integer> list, TreeNode root) {
        if (root != null) {
            count(list, root.left);
            list.add(root.val);
            count(list, root.right);
        }
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
