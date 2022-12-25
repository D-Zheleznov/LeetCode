public class _191_NumberOf1Bits {

    private static final String INPUT_1 = "00000000000000000000000000001011";
    private static final String INPUT_2 = "00000000000000000000000010000000";
    private static final String INPUT_3 = "11111111111111111111111111111101";

    //Сколько единиц в строке
    public static void main(String[] args) {
//        System.out.println(hammingWeight(INPUT_1)); //3
//        System.out.println(hammingWeight(INPUT_2)); //1
//        System.out.println(hammingWeight(INPUT_3)); //31
    }

    //O(n) //O(1)
    public int hammingWeight(int num) {
        int count = 0;
        while (num != 0) {
            num = num & (num - 1);
            count++;
        }
        return count;
    }
}
