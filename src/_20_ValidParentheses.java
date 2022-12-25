import java.util.Deque;
import java.util.LinkedList;

public class _20_ValidParentheses {

    private static final String INPUT_1 = "()";
    private static final String INPUT_2 = "()[]{}";
    private static final String INPUT_3 = "(]";
    private static final String INPUT_4 = "()[]{}()";
    private static final String INPUT_5 = "({})";

    //Определить строки с корректным форматом скобок
    public static void main(String[] args) {
        System.out.println(isValid(INPUT_1)); //true
        System.out.println(isValid(INPUT_2)); //true
        System.out.println(isValid(INPUT_3)); //false
        System.out.println(isValid(INPUT_4)); //true
        System.out.println(isValid(INPUT_5)); //true
    }

    //O(n) //O(1)
    private static boolean isValid(String string) {
        Deque<Character> stack = new LinkedList<>();
        for (char letter : string.toCharArray()) {
            if (letter == '(')
                stack.push(')');
            else if (letter == '{')
                stack.push('}');
            else if (letter == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != letter)
                return false;
        }
        return stack.isEmpty();
    }
}
