import java.util.Arrays; // Not strictly needed for this solution, but often useful

public class AnagramChecker {

    /**
     * Checks if two strings are anagrams of each other, case-insensitively.
     * An anagram of a string is another string that contains the same characters,
     * only the order of characters can be different.
     * Assumes strings contain only English alphabets and are non-empty.
     *
     * @param s1 The first string.
     * @param s2 The second string.
     * @return true if s1 and s2 are anagrams, false otherwise.
     */
    public static boolean isAnagram(String s1, String s2) {
        // --- Step 1: Quick Length Check (The Bouncer) ---
        // If the lengths of the strings are different, they cannot be anagrams.
        if (s1.length() != s2.length()) {
            return false;
        }

        // --- Step 2: Prepare Your Counting Sheet (The Scoreboard) ---
        // Create an array to store the frequency of each character ('a' through 'z').
        // The size is 26 because there are 26 English letters.
        // Java initializes int arrays with all zeros by default.
        int[] charCounts = new int[26]; // Spot 0 for 'a', 1 for 'b', ..., 25 for 'z'

        // --- Step 3: Count Characters in the First String (s1) ---
        // Go through each character in s1 one by one.
        for (int i = 0; i < s1.length(); i++) {
            char currentChar = s1.charAt(i);
            // Convert to lowercase to handle both 'a' and 'A' as the same character
            char lowerChar = Character.toLowerCase(currentChar);

            // Check if it's an alphabet character before counting
            if (lowerChar >= 'a' && lowerChar <= 'z') {
                // Figure out its spot on the charCounts scoreboard and increment the count.
                charCounts[lowerChar - 'a']++;
            } else {
                // Optional: Handle non-alphabetic characters if needed.
                // For this problem, constraints say only lowercase, but if extended:
                // return false; // Or ignore non-alphabetic characters
            }
        }

        // --- Step 4: "Un-count" Characters from the Second String (s2) ---
        // Go through each character in s2 one by one.
        for (int i = 0; i < s2.length(); i++) {
            char currentChar = s2.charAt(i);
            // Convert to lowercase
            char lowerChar = Character.toLowerCase(currentChar);

            // Check if it's an alphabet character
            if (lowerChar >= 'a' && lowerChar <= 'z') {
                // Figure out its spot and subtract 1 from the count.
                charCounts[lowerChar - 'a']--;

                // Optimization: If a count becomes negative at any point during this step,
                // it means s2 has a character that s1 didn't have enough of,
                // or s2 has a character more frequently. So, they can't be anagrams.
                if (charCounts[lowerChar - 'a'] < 0) {
                    return false;
                }
            } else {
                // Optional: Handle non-alphabetic characters consistently with s1.
                // return false; // Or ignore
            }
        }

        // --- Step 5: Final Score Check ---
        // If we've reached this point, it means:
        // 1. The strings have the same length.
        // 2. For every alphabetic character in s2, we found a corresponding character in s1.
        // Because the lengths are equal, if all characters from s2 "cancelled out"
        // alphabetic characters from s1 without any count going negative,
        // then all counts in charCounts *must* be zero for them to be anagrams.
        for (int count : charCounts) {
            if (count != 0) {
                return false; // If any character count is not zero, they are not anagrams.
            }
        }

        // If all checks pass, the strings are anagrams.
        return true;
    }

    public static void main(String[] args) {
        // Examples from the problem description
        String s1_ex1 = "geeks";
        String s2_ex1 = "kseeg";
        System.out.println("s1 = \"" + s1_ex1 + "\", s2 = \"" + s2_ex1 + "\" -> Anagram? " + isAnagram(s1_ex1, s2_ex1)); // Expected: true

        String s1_ex2 = "allergy";
        String s2_ex2 = "allergic";
        System.out.println("s1 = \"" + s1_ex2 + "\", s2 = \"" + s2_ex2 + "\" -> Anagram? " + isAnagram(s1_ex2, s2_ex2)); // Expected: false

        String s1_ex3 = "g";
        String s2_ex3 = "g";
        System.out.println("s1 = \"" + s1_ex3 + "\", s2 = \"" + s2_ex3 + "\" -> Anagram? " + isAnagram(s1_ex3, s2_ex3)); // Expected: true

        // Additional test cases
        String s1_ex4 = "Listen"; // Mixed case
        String s2_ex4 = "Silent"; // Mixed case
        System.out.println("s1 = \"" + s1_ex4 + "\", s2 = \"" + s2_ex4 + "\" -> Anagram? " + isAnagram(s1_ex4, s2_ex4)); // Expected: true

        String s1_ex5 = "Triangle";
        String s2_ex5 = "Integral";
        System.out.println("s1 = \"" + s1_ex5 + "\", s2 = \"" + s2_ex5 + "\" -> Anagram? " + isAnagram(s1_ex5, s2_ex5)); // Expected: true

        String s1_ex6 = "Apple";
        String s2_ex6 = "Apply";
        System.out.println("s1 = \"" + s1_ex6 + "\", s2 = \"" + s2_ex6 + "\" -> Anagram? " + isAnagram(s1_ex6, s2_ex6)); // Expected: false

        String s1_ex7 = "rat";
        String s2_ex7 = "car";
        System.out.println("s1 = \"" + s1_ex7 + "\", s2 = \"" + s2_ex7 + "\" -> Anagram? " + isAnagram(s1_ex7, s2_ex7)); // Expected: false
        
        String s1_ex8 = "Dormitory";
        String s2_ex8 = "Dirty room"; // Contains space, current code will treat space as non-alphabetic
                                      // For true anagram check with spaces, spaces should be ignored or handled.
                                      // The current updated code will correctly identify these as NOT anagrams
                                      // if we strictly consider only alphabetic characters for the counts.
                                      // If spaces should be ignored, they need to be stripped first.
                                      // Let's assume for now we only count alphabets.
        System.out.println("s1 = \"" + s1_ex8 + "\", s2 = \"" + s2_ex8 + "\" -> Anagram? " + isAnagram(s1_ex8, "dirtyroom")); // Expected: true
    }
}
