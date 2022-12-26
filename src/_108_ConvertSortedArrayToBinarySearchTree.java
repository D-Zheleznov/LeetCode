import util.TreeNode;

public class _108_ConvertSortedArrayToBinarySearchTree {

    private static final int[] INPUT_1 = new int[]{-10, -3, 0, 5, 9};
    private static final int[] INPUT_2 = new int[]{1, 3};

    //Input: nums = [-10,-3,0,5,9]
    //Output: [0,-3,9,-10,null,5]
    //Explanation: [0,-10,5,null,-3,null,9] is also accepted:

    //Input: nums = [1,3]
    //Output: [3,1]
    //Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
    public static void main(String[] args) {
        sortedArrayToBST(INPUT_1); //[0,-10,5,null,-3,null,9]
        sortedArrayToBST(INPUT_2); //[1,3]
    }

    //O(n) //O(n)
    private static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;

        return makeBST(nums, 0, nums.length - 1);
    }

    public static TreeNode makeBST(int[] nums, int low, int high) {
        if (low > high)
            return null;

        //берётся середина
        int middle = (low + high) / 2;
        var root = new TreeNode(nums[middle]);

        //массив разбивается на два и меняются указатели
        root.left = makeBST(nums, low, middle - 1);
        root.right = makeBST(nums, middle + 1, high);

        return root;
    }
}
