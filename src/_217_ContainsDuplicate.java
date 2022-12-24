import java.util.HashSet;
import java.util.Set;

public class _217_ContainsDuplicate {

    //Если любой элемент встречается более чем один раз - true
    //Если все значения уникальны - false
    public static void main(String[] args) {
        int[] input1 = new int[]{1, 2, 3, 1};
        int[] input2 = new int[]{1, 2, 3, 4};
        int[] input3 = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(containsDuplicate(input1)); //true
        System.out.println(containsDuplicate(input2)); //false
        System.out.println(containsDuplicate(input3)); //true
    }

    //O(n) //O(n)
    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }
}
