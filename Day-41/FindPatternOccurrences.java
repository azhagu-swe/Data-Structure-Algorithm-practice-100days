import java.util.ArrayList;
import java.util.List;

public class FindPatternOccurrences {

    /**
     * Finds all starting indices of occurrences of a pattern string within a text string
     * using the Knuth-Morris-Pratt (KMP) algorithm.
     * The LPS array computation is inlined within this method.
     * Time Complexity: O(N + M), where N is length of text and M is length of pattern.
     * Space Complexity: O(M) for the LPS array.
     *
     * @param txt The text string to search within.
     * @param pat The pattern string to search for.
     * @return A List of 0-based indices where the pattern occurs in the text.
     * Returns an empty list if no occurrences are found or if inputs are invalid.
     */
    public static List<Integer> findAllOccurrences(String txt, String pat) {
        List<Integer> resultIndices = new ArrayList<>();

        // --- Edge Case Handling ---
        if (pat == null || txt == null || pat.isEmpty() || txt.length() < pat.length()) {
            return resultIndices; // Return empty list
        }

        int textLength = txt.length();
        int patternLength = pat.length();

        // --- Step 1: Preprocessing the Pattern (Compute LPS Array - Inlined) ---
        int[] lps = new int[patternLength];
        // lps[i] = length of the longest proper prefix of pat[0...i] which is also a suffix of pat[0...i].
        
        // length of the previous longest prefix suffix for LPS computation
        int lengthLPS = 0; 
        int k = 1; // index for iterating through pattern to build LPS
        lps[0] = 0; // lps[0] is always 0

        // the loop calculates lps[k] for k = 1 to patternLength-1
        while (k < patternLength) {
            if (pat.charAt(k) == pat.charAt(lengthLPS)) {
                lengthLPS++;
                lps[k] = lengthLPS;
                k++;
            } else { // (pat[k] != pat[lengthLPS])
                if (lengthLPS != 0) {
                    // This is tricky. We do not increment k here.
                    // We try to find a shorter prefix that is also a suffix.
                    lengthLPS = lps[lengthLPS - 1];
                } else { // if (lengthLPS == 0)
                    lps[k] = 0; // No common prefix-suffix found ending at k
                    k++;
                }
            }
        }
        // --- End of Inlined LPS Array Computation ---

        // --- Step 2: Searching in the Text ---
        int i = 0; // index for txt[]
        int j = 0; // index for pat[] (current match length)

        while (i < textLength) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++; // Move text pointer
                j++; // Move pattern pointer (extend current match)
            }

            if (j == patternLength) {
                // Found pattern at index (i - j)
                resultIndices.add(i - j);
                // To find other occurrences, update j using LPS array.
                // This allows the algorithm to continue searching from a point
                // where a prefix of the pattern already matches a suffix of the found pattern.
                j = lps[j - 1];
            }
            // Mismatch after j matches
            else if (i < textLength && pat.charAt(j) != txt.charAt(i)) {
                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway.
                // If j is not 0, it means we had some partial match.
                // We use the LPS value to skip characters in the pattern.
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    // If j is 0, it means the first character of the pattern didn't match.
                    // So, we move to the next character in the text.
                    i = i + 1;
                }
            }
        }
        return resultIndices;
    }

    public static void main(String[] args) {
        // Example 1
        String txt1 = "abcab";
        String pat1 = "ab";
        System.out.println("Text: \"" + txt1 + "\", Pattern: \"" + pat1 + "\"");
        System.out.println("Occurrences: " + findAllOccurrences(txt1, pat1)); // Expected: [0, 3]
        System.out.println("----------");

        // Example 2
        String txt2 = "abesdu";
        String pat2 = "edu";
        System.out.println("Text: \"" + txt2 + "\", Pattern: \"" + pat2 + "\"");
        System.out.println("Occurrences: " + findAllOccurrences(txt2, pat2)); // Expected: []
        System.out.println("----------");

        // Example 3
        String txt3 = "aabaacaadaabaaba";
        String pat3 = "aaba";
        System.out.println("Text: \"" + txt3 + "\", Pattern: \"" + pat3 + "\"");
        System.out.println("Occurrences: " + findAllOccurrences(txt3, pat3)); // Expected: [0, 9, 12]
        System.out.println("----------");

        // Additional Test Cases
        String txt4 = "aaaaa";
        String pat4 = "aa";
        System.out.println("Text: \"" + txt4 + "\", Pattern: \"" + pat4 + "\"");
        System.out.println("Occurrences: " + findAllOccurrences(txt4, pat4)); // Expected: [0, 1, 2, 3]
        System.out.println("----------");

        String txt5 = "abc";
        String pat5 = "d";
        System.out.println("Text: \"" + txt5 + "\", Pattern: \"" + pat5 + "\"");
        System.out.println("Occurrences: " + findAllOccurrences(txt5, pat5)); // Expected: []
        System.out.println("----------");

        String txt6 = "ababab";
        String pat6 = "aba";
        System.out.println("Text: \"" + txt6 + "\", Pattern: \"" + pat6 + "\"");
        System.out.println("Occurrences: " + findAllOccurrences(txt6, pat6)); // Expected: [0, 2]
        System.out.println("----------");
        
        String txt7 = "mississippi";
        String pat7 = "issi";
        System.out.println("Text: \"" + txt7 + "\", Pattern: \"" + pat7 + "\"");
        System.out.println("Occurrences: " + findAllOccurrences(txt7, pat7)); // Expected: [1, 4]
        System.out.println("----------");

        String txt8 = "ABABDABACDABABCABAB";
        String pat8 = "ABABCABAB";
        System.out.println("Text: \"" + txt8 + "\", Pattern: \"" + pat8 + "\"");
        System.out.println("Occurrences: " + findAllOccurrences(txt8, pat8)); // Expected: [10]
        System.out.println("----------");
    }
}
