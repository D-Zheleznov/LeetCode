import java.util.Arrays;

public class _344_ReverseString {

    private static final char[] INPUT_1 = new char[]{'h', 'e', 'l', 'l', 'o'};
    private static final char[] INPUT_2 = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};

    //Развернуть массив символов
    public static void main(String[] args) {
        reverseString(INPUT_1);
        reverseString(INPUT_2);

        System.out.println(Arrays.toString(INPUT_1)); //[o, l, l, e, h]
        System.out.println(Arrays.toString(INPUT_2)); //[h, a, n, n, a, H]
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
