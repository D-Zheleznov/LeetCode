import java.util.Arrays;

public class _344_ReverseString {

    //Развернуть массив символов
    public static void main(String[] args) {
        char[] input1 = new char[]{'h','e','l','l','o'};
        char[] input2 = new char[]{'H','a','n','n','a','h'};

        reverseString(input1);
        reverseString(input2);
        System.out.println(Arrays.toString(input1)); //[o, l, l, e, h]
        System.out.println(Arrays.toString(input2)); //[h, a, n, n, a, H]
    }

    //O(n) //O(1)
    private static void reverseString(char[] chars) {
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[(chars.length - 1) - i];
            chars[(chars.length - 1) - i] = chars[i];
            chars[i] = temp;
        }
    }
}
