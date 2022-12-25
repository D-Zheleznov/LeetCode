import java.util.*;

public class _1_TwoSum {

    private static final int[] INPUT_1 = new int[]{2, 7, 11, 15};
    private static final int TARGET_1 = 9;
    private static final int[] INPUT_2 = new int[]{3, 2, 4};
    private static final int TARGET_2 = 6;
    private static final int[] INPUT_3 = new int[]{3, 3};
    private static final int TARGET_3 = 6;

    //Найти два числа в массиве чтобы их сумма равнялась заданному числу
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(INPUT_1, TARGET_1))); //[0,1]
        System.out.println(Arrays.toString(twoSum(INPUT_2, TARGET_2))); //[1,2]
        System.out.println(Arrays.toString(twoSum(INPUT_3, TARGET_3))); //[0,1]
    }

    //O(n) //O(n)
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
