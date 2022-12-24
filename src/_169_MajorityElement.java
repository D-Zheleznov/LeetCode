import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _169_MajorityElement {

    //Найти число в массиве большее чем длина массива / 2
    public static void main(String[] args) {
        int[] input1 = new int[]{3, 2, 3};
        int[] input2 = new int[]{2, 2, 1, 1, 1, 2, 2};

        System.out.println(majorityElement3(input1)); //3
        System.out.println(majorityElement3(input2)); //2
    }

    //O(n) //O(n)
    private static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.merge(num, 1, Integer::sum);

        return map.entrySet().stream()
                .filter(entry -> entry.getValue() > nums.length / 2)
                .findFirst().get().getKey();
    }

    //O(n * Log(n)) //O(1)
    private static int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    //Алгоритм Бойера — Мура
    //O(n) //O(1)
    private static int majorityElement3(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0)
                candidate = num;

            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
