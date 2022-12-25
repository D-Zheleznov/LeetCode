public class _268_MissingNumber {

    private static final int[] INPUT_1 = new int[]{3, 0, 1};
    private static final int[] INPUT_2 = new int[]{0, 1};
    private static final int[] INPUT_3 = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};

    //Найти недостающее число в последовательности чисел в массиве [0 - N]
    // N - число элементов в массиве
    public static void main(String[] args) {
        System.out.println(missingNumber(INPUT_1)); //2
        System.out.println(missingNumber(INPUT_2)); //2
        System.out.println(missingNumber(INPUT_3)); //8
    }

    //Формула (N * (N + 1)) / 2
    //O(n) //O(1)
    private static int missingNumber(int[] nums) {
        int arraySum = 0;
        int expectedSum = (nums.length * (nums.length + 1)) / 2;
        for (int num : nums)
            arraySum += num;

        return expectedSum - arraySum;
    }
}
