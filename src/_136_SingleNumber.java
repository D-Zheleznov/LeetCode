import java.util.HashMap;
import java.util.Map;

public class _136_SingleNumber {

    private static final int[] INPUT_1 = new int[]{2, 2, 1};
    private static final int[] INPUT_2 = new int[]{4, 1, 2, 1, 2};
    private static final int[] INPUT_3 = new int[]{1};

    //Найти число в массиве которое встречается только один раз
    public static void main(String[] args) {
        System.out.println(singleNumber(INPUT_1)); //1
        System.out.println(singleNumber(INPUT_2)); //4
        System.out.println(singleNumber(INPUT_3)); //1
    }

    //O(n) //O(n)
    private static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.merge(num, 1, Integer::sum);
        return map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst().get()
                .getKey();
    }

    //(2^2)^(1^1)^(4^4)^(5)) => (0^0^0^5) => 5
    //
    //O(n) //O(1)
    private static int singleNumber2(int[] nums) {
        int result = 0;
        for (int num : nums)
            result ^= num;

        return result;
    }
}
