public class _14_LongestCommonPrefix {

    //Найти общий префикс
    public static void main(String[] args) {
        String[] input1 = new String[]{"flower","flow","flight"};
        String[] input2 = new String[]{"dog","racecar","car"};

        System.out.println(longestCommonPrefix(input1)); //fl
        System.out.println(longestCommonPrefix(input2)); //""
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
