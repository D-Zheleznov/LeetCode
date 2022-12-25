import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _94_BinaryTreeInorderTraversal {

    private static final TreeNode NODE_3 = new TreeNode(3, null, null);
    private static final TreeNode NODE_2 = new TreeNode(2, NODE_3, null);
    private static final TreeNode NODE_1 = new TreeNode(1, null, NODE_2);

    //Input: root = [1,null,2,3]
    //
    //Неупорядоченный обход узлов дерева
    public static void main(String[] args) {
        System.out.println(inorderTraversal(NODE_1)); //[1,3,2]
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
}
