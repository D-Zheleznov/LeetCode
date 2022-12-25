import java.util.HashSet;
import java.util.Set;

public class _217_ContainsDuplicate {

    private static final int[] INPUT_1 = new int[]{1, 2, 3, 1};
    private static final int[] INPUT_2 = new int[]{1, 2, 3, 4};
    private static final int[] INPUT_3 = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

    //Если любой элемент встречается более чем один раз - true
    //Если все значения уникальны - false
    public static void main(String[] args) {
        System.out.println(containsDuplicate(INPUT_1)); //true
        System.out.println(containsDuplicate(INPUT_2)); //false
        System.out.println(containsDuplicate(INPUT_3)); //true
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
