import java.util.Arrays;

public class _283_MoveZeroes {

    private static final int[] INPUT_1 = new int[]{0, 1, 0, 3, 12};
    private static final int[] INPUT_2 = new int[]{2, 4, 0, 6, 0, 16};
    private static final int[] INPUT_3 = new int[]{0, 0, 0, 2, 0, 5};
    private static final int[] INPUT_4 = new int[]{0};

    //Переместить нули в массиве в конец списка сохраняя порядок элементов
    public static void main(String[] args) {
        moveZeroes(INPUT_1);
        moveZeroes(INPUT_2);
        moveZeroes(INPUT_3);
        moveZeroes(INPUT_4);

        System.out.println(Arrays.toString(INPUT_1)); //[1,3,12,0,0]
        System.out.println(Arrays.toString(INPUT_2)); //[2,4,6,16,0,0]
        System.out.println(Arrays.toString(INPUT_3)); //[2,5,0,0,0,0]
        System.out.println(Arrays.toString(INPUT_4)); //[0]
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
