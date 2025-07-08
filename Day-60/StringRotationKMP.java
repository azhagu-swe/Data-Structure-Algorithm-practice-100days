public class StringRotationKMP {

    /**
     * Compute the LPS (longest proper prefix which is also suffix) array for KMP.
     */
    private static int[] computeLPS(String pat) {
        int n = pat.length();
        int[] lps = new int[n];
        int len = 0;  // length of previous longest prefix suffix
        lps[0] = 0;   // lps[0] is always 0
        
        int i = 1;
        while (i < n) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    // fall back in the pattern
                    len = lps[len - 1];
                    // note: we don't increment i here
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    /**
     * KMP search: returns true if pat is a substring of txt.
     */
    private static boolean kmpSearch(String txt, String pat) {
        int N = txt.length();
        int M = pat.length();
        int[] lps = computeLPS(pat);

        int i = 0;  // index for txt
        int j = 0;  // index for pat
        while (i < N) {
            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
                if (j == M) {
                    return true;  // found a match
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1];  // fall back in the pattern
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    /**
     * Returns true if s2 is a rotation of s1 using KMP-based substring search.
     */
    public static boolean isRotation(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }
        String doubled = s1 + s1;
        return kmpSearch(doubled, s2);
    }

    public static void main(String[] args) {
        String[][] tests = {
            {"abcd", "cdab"},
            {"aab",  "aba"},
            {"abcd", "acbd"}
        };

        for (var pair : tests) {
            String s1 = pair[0], s2 = pair[1];
            System.out.printf("s1=\"%s\", s2=\"%s\" → %b%n",
                s1, s2, isRotation(s1, s2));
        }
    }
}
