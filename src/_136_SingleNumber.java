import java.util.HashMap;
import java.util.Map;

public class _136_SingleNumber {

    //Найти число в массиве которое встречается только один раз
    public static void main(String[] args) {
        int[] input1 = new int[]{2,2,1};
        int[] input2 = new int[]{4,1,2,1,2};
        int[] input3 = new int[]{1};

        System.out.println(singleNumber(input1)); //1
        System.out.println(singleNumber(input2)); //4
        System.out.println(singleNumber(input3)); //1

        System.out.println(singleNumber2(input1)); //1
        System.out.println(singleNumber2(input2)); //4
        System.out.println(singleNumber2(input3)); //1
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
