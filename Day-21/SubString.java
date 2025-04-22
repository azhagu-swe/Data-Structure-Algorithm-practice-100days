
import java.util.HashSet;
import java.util.Set;

class SubString {
    /**
     * Finds the length of the longest substring without repeating characters.
     *
     * Analogy: Finding the longest section of a bead line with no repeating colors,
     * using a sliding window approach.
     *
     * @param s The input string.
     * @return The length of the longest substring without repeating characters.
     */
    public int lengthOfLongestSubstring(String s) {
        // Handle edge case of null or empty string.
        if (s == null || s.length() == 0) {
            return 0;
        }

        int n = s.length();
        int left = 0; // Left pointer of the sliding window.
        int right = 0; // Right pointer of the sliding window.
        int maxLength = 0; // Stores the maximum length found so far.

        // This set stores the characters currently inside the window [left, right).
        // Used to quickly check for duplicates.
        Set<Character> windowChars = new HashSet<>();

        // Expand the window by moving the right pointer.
        while (right < n) {
            char charAtRight = s.charAt(right);

            // Check if the character at the right pointer is already in the window.
            // If it is, we need to shrink the window from the left until the duplicate is
            // removed.
            while (windowChars.contains(charAtRight)) {
                // Remove the character at the left pointer from the set.
                windowChars.remove(s.charAt(left));
                // Move the left pointer one step to the right (shrink window).
                left++;
            }

            // Now we know the character at 'right' is not a duplicate in the current window
            // [left, right].
            // Add the character at the right pointer to the set.
            windowChars.add(charAtRight);

            // Calculate the length of the current valid window.
            int currentLength = right - left + 1;

            // Update the maximum length found so far.
            maxLength = Math.max(maxLength, currentLength);

            // Move the right pointer to expand the window for the next iteration.
            right++;
        }

        // After the loop finishes, maxLength holds the answer.
        return maxLength;
    }

    // Example Usage (optional, for testing)
    public static void main(String[] args) {
        SubString sol = new SubString();

        System.out.println("Input: abcabcbb, Output: " + sol.lengthOfLongestSubstring("abcabcbb")); // Expected: 3
        System.out.println("Input: bbbbb, Output: " + sol.lengthOfLongestSubstring("bbbbb")); // Expected: 1
        System.out.println("Input: pwwkew, Output: " + sol.lengthOfLongestSubstring("pwwkew")); // Expected: 3
        System.out.println("Input: \"\", Output: " + sol.lengthOfLongestSubstring("")); // Expected: 0
    }
}