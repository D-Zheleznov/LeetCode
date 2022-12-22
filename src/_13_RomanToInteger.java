import java.util.Map;

public class _13_RomanToInteger {

    //Symbol       Value
    //I             1
    //V             5
    //X             10
    //L             50
    //C             100
    //D             500
    //M             1000
    //I can be placed before V (5) and X (10) to make 4 and 9.
    //X can be placed before L (50) and C (100) to make 40 and 90.
    //C can be placed before D (500) and M (1000) to make 400 and 900.
    //
    //Спарсить римские цифры в латинские
    public static void main(String[] args) {
        String input1 = "III";
        String input2 = "LVIII";
        String input3 = "MCMXCIV";

        System.out.println(romanToInt(input1)); //3
        System.out.println(romanToInt(input2)); //58
        System.out.println(romanToInt(input3)); //1994
    }

    //O(n) //O(n)
    public static int romanToInt(String string) {
        String number = string;
        int result = 0;

        Map<String, Integer> map = Map.of(
                "IV", 4,
                "IX", 9,
                "XL", 40,
                "XC", 90,
                "CD", 400,
                "CM", 900);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (number.contains(entry.getKey())) {
                result += entry.getValue();
                number = number.replace(entry.getKey(), "");
            }
        }
        String[] letters = number.split("");
        for (String letter : letters) {
            switch (letter) {
                case "I" -> result += 1;
                case "V" -> result += 5;
                case "X" -> result += 10;
                case "L" -> result += 50;
                case "C" -> result += 100;
                case "D" -> result += 500;
                case "M" -> result += 1000;
            }
        }
        return result;
    }
}
