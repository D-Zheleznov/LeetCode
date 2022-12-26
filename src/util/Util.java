package util;

public class Util {

    public static void printListNode(ListNode root) {
        System.out.print(root.val);
        if (root.next != null) {
            System.out.print(" --> ");
            printListNode(root.next);
        } else
            System.out.println();
    }

    public static ListNode arrayToListNode(int[] nums) {
        ListNode node = new ListNode(0);
        ListNode head = node;

        for (int num : nums) {
            node.next = new ListNode(num);
            node = node.next;
        }
        return head.next;
    }

//    private static final TreeNode NODE_5 = new TreeNode(7, null, null);
//    private static final TreeNode NODE_4 = new TreeNode(15, null, null);
//    private static final TreeNode NODE_3 = new TreeNode(20, NODE_4, NODE_5);
//    private static final TreeNode NODE_2 = new TreeNode(9, null, null);
//    private static final TreeNode NODE_1 = new TreeNode(3, NODE_2, NODE_3);
//
//    //Input: root = [3,9,20,null,null,15,7]
//    public static TreeNode mapToTreeNode(Map<Integer, Integer[]> map) {
//        TreeNode node = new TreeNode(0);
//        TreeNode head = node;
//
//        for (Integer root : map.keySet()) {
//
//        }
//        for (Integer[] nums : map.values()) {
//            node.left = nums[0] != null ? new TreeNode(nums[0]) : null;
//            node.right = nums[0] != null ? new TreeNode(nums[1]) : null;
//        }
//
//        return null;
//    }

}
