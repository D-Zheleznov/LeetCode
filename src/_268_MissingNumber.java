public class _268_MissingNumber {

    //Найти недостающее число в последовательности чисел в массиве [0 - N]
    // N - число элементов в массиве
    public static void main(String[] args) {
        int[] input1 = new int[]{3, 0, 1};
        int[] input2 = new int[]{0, 1};
        int[] input3 = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println(missingNumber(input1)); //2
        System.out.println(missingNumber(input2)); //2
        System.out.println(missingNumber(input3)); //8
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
