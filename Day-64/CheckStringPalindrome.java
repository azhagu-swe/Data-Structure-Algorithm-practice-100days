public class CheckStringPalindrome {
    public static void main(String[] args) {
        String word = "radar";

        // Using StringBuilder reverse method
        boolean isPalindrome = isPalindromeWithBuilder(word);
        System.out.println("Using StringBuilder: Word is Palindrome: " + isPalindrome);

        // Manual way
        boolean isPalindromeManual = isPalindromeManual(word);
        System.out.println("Manual Check: Word is Palindrome: " + isPalindromeManual);
    }

    private static boolean isPalindromeWithBuilder(String word) {
        return new StringBuilder(word).reverse().toString().equals(word);
    }

    private static boolean isPalindromeManual(String word) {
        int n = word.length();
        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
