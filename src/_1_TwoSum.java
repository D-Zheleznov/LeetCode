import java.util.*;

public class _1_TwoSum {

    //Найти два числа в массиве чтобы их сумма равнялась заданному числу
    public static void main(String[] args) {
        int[] input1 = new int[]{2,7,11,15};
        int target1 = 9;
        int[] input2 = new int[]{3,2,4};
        int target2 = 6;
        int[] input3 = new int[]{3,3};
        int target3 = 6;

        System.out.println(Arrays.toString(twoSum(input1, target1))); //[0,1]
        System.out.println(Arrays.toString(twoSum(input2, target2))); //[1,2]
        System.out.println(Arrays.toString(twoSum(input3, target3))); //[0,1]
    }

    //O(n) //O(n)
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
