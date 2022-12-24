import java.util.*;

public class _66_PlusOne {

    //Увеличить число на 1 распределённое в массиве
    public static void main(String[] args) {
        int[] input1 = new int[]{1, 2, 3};
        int[] input2 = new int[]{9, 9, 9, 9};
        int[] input3 = new int[]{4, 3, 2, 1};
        int[] input4 = new int[]{9, 1, 9, 9};
        int[] input5 = new int[]{9};

        System.out.println(Arrays.toString(plusOne(input1))); //[1,2,4]
        System.out.println(Arrays.toString(plusOne(input2))); //[1,0,0,0,0]
        System.out.println(Arrays.toString(plusOne(input3))); //[4,3,2,2]
        System.out.println(Arrays.toString(plusOne(input4))); //[9,2,0,0]
        System.out.println(Arrays.toString(plusOne(input5))); //[1,0]
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
