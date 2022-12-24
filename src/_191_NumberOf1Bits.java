public class _191_NumberOf1Bits {

    //Сколько единиц в строке
    public static void main(String[] args) {
        String input1 = "00000000000000000000000000001011";
        String input2 = "00000000000000000000000010000000";
        String input3 = "11111111111111111111111111111101";

//        System.out.println(hammingWeight(input1)); //3
//        System.out.println(hammingWeight(input2)); //1
//        System.out.println(hammingWeight(input3)); //31
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
