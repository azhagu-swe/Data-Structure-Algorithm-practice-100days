import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            String longestPalindrome = findLongestPalindrome(input);
            System.out.println("Longest Palindromic Substring: " + longestPalindrome);
        }
    }

    private static String findLongestPalindrome(String s) {
        if (s == null || s.length() < 1)
            return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Expand around the current character
            int len1 = expandAroundCenter(s, i, i);
            // Expand around the gap between current and next character
            int len2 = expandAroundCenter(s, i, i + 1);

            int maxLength = Math.max(len1, len2);

            if (maxLength > (end - start)) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the length of the palindrome
        return right - left - 1;
    }
}
