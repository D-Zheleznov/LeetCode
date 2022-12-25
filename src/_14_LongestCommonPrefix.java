public class _14_LongestCommonPrefix {

    private static final String[] INPUT_1 = new String[]{"flower", "flow", "flight"};
    private static final String[] INPUT_2 = new String[]{"dog", "racecar", "car"};

    //Найти общий префикс
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(INPUT_1)); //fl
        System.out.println(longestCommonPrefix(INPUT_2)); //""
    }

    //O(n) //O(1)
    private static String longestCommonPrefix(String[] stringArray) {
        if (stringArray.length == 0)
            return "";

        String prefix = stringArray[0];
        for (int i = 1; i < stringArray.length; i++)
            while (!stringArray[i].startsWith(prefix))
                prefix = prefix.substring(0, prefix.length() - 1);

        return prefix;
    }
}
