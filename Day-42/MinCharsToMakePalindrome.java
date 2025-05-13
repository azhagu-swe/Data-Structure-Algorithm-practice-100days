public class MinCharsToMakePalindrome {

    /**
     * Helper function to check if a given string is a palindrome.
     *
     * @param str The string to check.
     * @return true if the string is a palindrome, false otherwise.
     */
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters don't match
            }
            left++;
            right--;
        }
        return true; // All characters matched
    }

    /**
     * Calculates the minimum number of characters to be added
     * at the front of the string to make it a palindrome.
     *
     * @param s The input string.
     * @return The minimum number of characters to add.
     */
    public static int minCharsToAdd(String s) {
        if (s == null || s.isEmpty()) {
            return 0; // Or handle as an error/specific requirement
        }

        int n = s.length();
        int longestPalindromicPrefixLength = 0;

        // --- Step 2 & 3: Check from the full string downwards ---
        // Iterate from the full length of s down to 1.
        // We are looking for the longest prefix of 's' that is a palindrome.
        for (int len = n; len >= 1; len--) {
            String prefix = s.substring(0, len); // Get the prefix of current length

            if (isPalindrome(prefix)) {
                // --- Step 4: Found the Longest Palindromic Start! ---
                longestPalindromicPrefixLength = len;
                break; // Since we are going from longest to shortest, the first one found is the longest
            }
        }

        // --- Step 5: Calculate Characters to Add ---
        // The number of characters to add is the total length minus the length
        // of the longest part from the beginning that was already a palindrome.
        // This is equivalent to the length of the "tail" that needs to be reversed and prepended.
        return n - longestPalindromicPrefixLength;
    }

    public static void main(String[] args) {
        // Examples from the problem description
        String s1 = "abc";
        System.out.println("Input: \"" + s1 + "\" -> Output: " + minCharsToAdd(s1)); // Expected: 2

        String s2 = "aacecaaaa";
        System.out.println("Input: \"" + s2 + "\" -> Output: " + minCharsToAdd(s2)); // Expected: 2

        // Additional test cases
        String s3 = "race";
        System.out.println("Input: \"" + s3 + "\" -> Output: " + minCharsToAdd(s3)); // Expected: 3 ("eca" + "race")

        String s4 = "google";
        System.out.println("Input: \"" + s4 + "\" -> Output: " + minCharsToAdd(s4)); // Expected: 5 ("elgoo" + "google")

        String s5 = "abab";
        System.out.println("Input: \"" + s5 + "\" -> Output: " + minCharsToAdd(s5)); // Expected: 1 ("b" + "abab")

        String s6 = "aba"; // Already a palindrome
        System.out.println("Input: \"" + s6 + "\" -> Output: " + minCharsToAdd(s6)); // Expected: 0

        String s7 = "a"; // Already a palindrome
        System.out.println("Input: \"" + s7 + "\" -> Output: " + minCharsToAdd(s7)); // Expected: 0

        String s8 = "palindrome";
        System.out.println("Input: \"" + s8 + "\" -> Output: " + minCharsToAdd(s8)); // Expected: 10
    }
}

