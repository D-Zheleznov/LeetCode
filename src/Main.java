import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {










        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 8, 8};
        calc(arr);
        calc2("dsfsdsdfsfdsffsffsdfsdfsfsdsdsd", "sd");
    }

    public static Set<Integer> calc(int[] arr) {
        Set<Integer> result = new TreeSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.stream(arr).forEach(el -> map.merge(el, 1, Integer::sum));
        Arrays.stream(arr).forEach(el -> {
            Integer integer = el * 2;
            if (map.containsKey(integer) && map.get(integer) == 1)
                result.add(el);
        });
        System.out.println(result);
        return result;
    }

    public static int calc2(String string, String seq) {
        int result = 0;
        Pattern pattern = Pattern.compile("(" + seq + "){2,}");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find())
            result += matcher.group().length() / seq.length();
        System.out.println(result);
        return result;
    }

}