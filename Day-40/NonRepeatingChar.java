
public class NonRepeatingChar {

    // Case‑insensitive: 'A' and 'a' treated the same
    static char nonRepeatingCharCaseInsensitive(String s) {
        String t = s.toLowerCase();
        int[] freq = new int[26];
        for (char c : t.toCharArray())
            freq[c - 'a']++;
        for (char c : t.toCharArray())
            if (freq[c - 'a'] == 1)
                return c;
        return '$';
    }

    // Case‑sensitive: 'A' and 'a' distinct
    static char nonRepeatingCharCaseSensitive(String s) {
        int[] freq = new int[52];
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z')
                freq[c - 'a']++;
            else if (c >= 'A' && c <= 'Z')
                freq[26 + (c - 'A')]++;
        }
        for (char c : s.toCharArray()) {
            int idx = (c >= 'a' && c <= 'z') ? c - 'a' : 26 + (c - 'A');
            if (freq[idx] == 1)
                return c;
        }
        return '$';
    }

    public static void main(String[] args) {
        String[] tests = { "geeksForgeeks", "RaceCar", "aAbBABac" };
        for (String s : tests) {
            System.out.printf(
                    "Insens('%s') → %c, Sens('%s') → %c%n",
                    s,
                    nonRepeatingCharCaseInsensitive(s),
                    s,
                    nonRepeatingCharCaseSensitive(s));
        }
    }
}
