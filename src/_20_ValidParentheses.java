import java.util.Deque;
import java.util.LinkedList;

public class _20_ValidParentheses {

    //Определить строки с корректным форматом скобок
    public static void main(String[] args) {
        String input1 = "()";
        String input2 = "()[]{}";
        String input3 = "(]";
        String input4 = "()[]{}()";
        String input5 = "({})";

        System.out.println(isValid(input1)); //true
        System.out.println(isValid(input2)); //true
        System.out.println(isValid(input3)); //false
        System.out.println(isValid(input4)); //true
        System.out.println(isValid(input5)); //true
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
