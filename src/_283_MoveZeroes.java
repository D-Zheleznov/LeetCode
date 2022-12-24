import java.util.Arrays;

public class _283_MoveZeroes {

    //Переместить нули в массиве в конец списка сохраняя порядок элементов
    public static void main(String[] args) {
        int[] input1 = new int[]{0, 1, 0, 3, 12};
        int[] input2 = new int[]{2, 4, 0, 6, 0, 16};
        int[] input3 = new int[]{0, 0, 0, 2, 0, 5};
        int[] input4 = new int[]{0};

        moveZeroes(input1);
        moveZeroes(input2);
        moveZeroes(input3);
        moveZeroes(input4);
        System.out.println(Arrays.toString(input1)); //[1,3,12,0,0]
        System.out.println(Arrays.toString(input2)); //[2,4,6,16,0,0]
        System.out.println(Arrays.toString(input3)); //[2,5,0,0,0,0]
        System.out.println(Arrays.toString(input4)); //[0]
    }

    //O(n) //O(1)
    private static void moveZeroes(int[] nums) {
        int insertIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[insertIndex];
                nums[insertIndex] = nums[i];
                nums[i] = temp;
                insertIndex++;
            }
        }
    }
}
