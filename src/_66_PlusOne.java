import java.util.*;

public class _66_PlusOne {

    private static final int[] INPUT_1 = new int[]{1, 2, 3};
    private static final int[] INPUT_2 = new int[]{9, 9, 9, 9};
    private static final int[] INPUT_3 = new int[]{4, 3, 2, 1};
    private static final int[] INPUT_4 = new int[]{9, 1, 9, 9};
    private static final int[] INPUT_5 = new int[]{9};

    //Увеличить число на 1 распределённое в массиве
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(INPUT_1))); //[1,2,4]
        System.out.println(Arrays.toString(plusOne(INPUT_2))); //[1,0,0,0,0]
        System.out.println(Arrays.toString(plusOne(INPUT_3))); //[4,3,2,2]
        System.out.println(Arrays.toString(plusOne(INPUT_4))); //[9,2,0,0]
        System.out.println(Arrays.toString(plusOne(INPUT_5))); //[1,0]
    }

    //O(n) //O(1)
    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
