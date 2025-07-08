public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"}; // Example array of strings
        String longestPrefix = longestCommonPrefixVertical(strs);
        System.out.println("Longest common prefix: " + longestPrefix);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // If the array is empty or null, return an empty string
        }
        String prefix = strs[0]; // Initialize prefix with the first string in the array
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1); // Reduce prefix length until it matches
                if (prefix.isEmpty()) {
                    return ""; // If prefix becomes empty, return an empty string
                }
            }
        }
        return prefix; // Return the longest common prefix
    }
    public static String longestCommonPrefixHorizontal(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++) {
        while (!strs[i].startsWith(prefix)) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) return "";
        }
    }
    return prefix;
}

public static String longestCommonPrefixVertical(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    for (int i = 0; i < strs[0].length(); i++) {
        char c = strs[0].charAt(i);
        for (int j = 1; j < strs.length; j++) {
            if (i == strs[j].length() || strs[j].charAt(i) != c) {
                return strs[0].substring(0, i);
            }
        }
    }
    return strs[0];
}
}        