//  Find the Longest Common Prefix
// Write a Java function to find the longest common prefix string amongst an array of strings.

// Here’s a Java program to find the longest common prefix among an array of strings:

public class LongestCommonPrefix22 {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" }; // Example array of strings
        String longestPrefix = longestCommonPrefix(strs);
        System.out.println("Longest common prefix: " + longestPrefix);
    }

    private static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = findCommonPrefix(prefix, strs[i]);
            if (prefix.isEmpty())
                return "";

        }
        return prefix;
    }

    private static String findCommonPrefix(String prefix, String string) {
        int minLength = prefix.length() < string.length() ? prefix.length() : string.length();
        int i = 0;
        while (minLength > i && prefix.charAt(i) == string.charAt(i))
            i++;

        return string.substring(0, i);
    }
}
