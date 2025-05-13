import java.util.ArrayList;
import java.util.List; // Not used in this specific solution, but often imported.

public class StringRotationCheck {

    /**
     * Checks if string s2 is a rotated version of string s1 using KMP for optimized substring search.
     * Both strings are assumed to be of equal length and contain lowercase characters.
     * This version avoids String.contains() and implements KMP search logic inlined.
     * Time Complexity: O(L) where L is the length of the strings.
     * Space Complexity: O(L) for the LPS array.
     *
     * @param s1 The first string.
     * @param s2 The second string.
     * @return true if s2 is a rotation of s1, false otherwise.
     */
    public static boolean areRotations(String s1, String s2) {
        // --- Step 1: Length Check ---
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.isEmpty()) { // s2 will also be empty
            return true;
        }

        // --- Step 2: Concatenate s1 with itself ---
        String concatenatedS1 = s1 + s1; // Text for KMP search (length 2*L)

        // --- Step 3: KMP Substring Search (for s2 in concatenatedS1) ---

        // --- 3a. Compute LPS Array for s2 (the pattern) ---
        int patternLength = s2.length(); // Length of s2 (M)
        int[] lps = new int[patternLength];
        int lengthLPS = 0; // Length of the previous longest prefix suffix
        int k = 1;         // Index for iterating through pattern s2 to build LPS
        lps[0] = 0;      // lps[0] is always 0

        while (k < patternLength) {
            if (s2.charAt(k) == s2.charAt(lengthLPS)) {
                lengthLPS++;
                lps[k] = lengthLPS;
                k++;
            } else { // (s2.charAt(k) != s2.charAt(lengthLPS))
                if (lengthLPS != 0) {
                    lengthLPS = lps[lengthLPS - 1];
                    // Do not increment k here
                } else { // if (lengthLPS == 0)
                    lps[k] = 0;
                    k++;
                }
            }
        }
        // --- End of LPS Array Computation ---

        // --- 3b. Search s2 in concatenatedS1 using the LPS array ---
        int textLength = concatenatedS1.length(); // Length of concatenatedS1 (N = 2*L)
        int i = 0; // Index for concatenatedS1 (text)
        int j = 0; // Index for s2 (pattern)

        while (i < textLength) {
            if (s2.charAt(j) == concatenatedS1.charAt(i)) {
                i++;
                j++;
            }

            if (j == patternLength) {
                // Pattern s2 found in concatenatedS1
                return true; // s2 is a rotation of s1
                // If we needed all occurrences, we would do:
                // resultIndices.add(i - j);
                // j = lps[j - 1];
            }
            // Mismatch after j matches
            else if (i < textLength && s2.charAt(j) != concatenatedS1.charAt(i)) {
                // Do not match lps[0..lps[j-1]] characters, they will match anyway.
                if (j != 0) {
                    j = lps[j - 1]; // Use LPS array to skip characters
                } else {
                    // If j is 0, it means the first character of the pattern didn't match.
                    i = i + 1; // Move to the next character in the text.
                }
            }
        }

        // If the loop finishes and pattern s2 was not found
        return false;
    }

    public static void main(String[] args) {
        // Examples from the problem description
        String s1_ex1 = "abcd";
        String s2_ex1 = "cdab";
        System.out.println("s1 = \"" + s1_ex1 + "\", s2 = \"" + s2_ex1 + "\" -> Are rotations? " + areRotations(s1_ex1, s2_ex1)); // Expected: true

        String s1_ex2 = "aab";
        String s2_ex2 = "aba";
        System.out.println("s1 = \"" + s1_ex2 + "\", s2 = \"" + s2_ex2 + "\" -> Are rotations? " + areRotations(s1_ex2, s2_ex2)); // Expected: true

        String s1_ex3 = "abcd";
        String s2_ex3 = "acbd";
        System.out.println("s1 = \"" + s1_ex3 + "\", s2 = \"" + s2_ex3 + "\" -> Are rotations? " + areRotations(s1_ex3, s2_ex3)); // Expected: false

        // Additional test cases
        String s1_ex4 = "geeksforgeeks";
        String s2_ex4 = "forgeeksgeeks";
        System.out.println("s1 = \"" + s1_ex4 + "\", s2 = \"" + s2_ex4 + "\" -> Are rotations? " + areRotations(s1_ex4, s2_ex4)); // Expected: true

        String s1_ex5 = "mightandmagic";
        String s2_ex5 = "andmagicmight";
        System.out.println("s1 = \"" + s1_ex5 + "\", s2 = \"" + s2_ex5 + "\" -> Are rotations? " + areRotations(s1_ex5, s2_ex5)); // Expected: true

        String s1_ex6 = "abc";
        String s2_ex6 = "bac";
        System.out.println("s1 = \"" + s1_ex6 + "\", s2 = \"" + s2_ex6 + "\" -> Are rotations? " + areRotations(s1_ex6, s2_ex6)); // Expected: false
        
        String s1_ex7 = "aaaaa";
        String s2_ex7 = "aaaaa";
        System.out.println("s1 = \"" + s1_ex7 + "\", s2 = \"" + s2_ex7 + "\" -> Are rotations? " + areRotations(s1_ex7, s2_ex7)); // Expected: true

        String s1_ex8 = "";
        String s2_ex8 = "";
        System.out.println("s1 = \"" + s1_ex8 + "\", s2 = \"" + s2_ex8 + "\" -> Are rotations? " + areRotations(s1_ex8, s2_ex8)); // Expected: true
        
        String s1_ex9 = "test";
        String s2_ex9 = "stte"; // Not a rotation
        System.out.println("s1 = \"" + s1_ex9 + "\", s2 = \"" + s2_ex9 + "\" -> Are rotations? " + areRotations(s1_ex9, s2_ex9)); // Expected: false
    }
}
