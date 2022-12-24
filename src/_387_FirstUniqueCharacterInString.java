import java.util.*;

public class _387_FirstUniqueCharacterInString {

    //Найти индекс первого неповторяющего символа
    public static void main(String[] args) {
        String input1 = "leetcode";
        String input2 = "loveleetcode";
        String input3 = "aabb";

        System.out.println(firstUniqChar(input1)); //0
        System.out.println(firstUniqChar(input2)); //2
        System.out.println(firstUniqChar(input3)); //-1
    }

    //O(n) //O(1)
    private static int firstUniqChar(String string) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < string.length(); i++) {
            map.merge(string.charAt(i), 1, Integer::sum);
        }
        Optional<Character> unique = map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        return unique.map(string::indexOf).orElse(-1);
    }
}
