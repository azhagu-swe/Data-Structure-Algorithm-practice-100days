import java.util.Arrays;

public class GroupAnagramArrayOnly {

    public static void main(String[] args) {
        String[] arr = { "act", "god", "cat", "dog", "tac" };
        String[][] groups = groupAnagram(arr);
        
        // Print result
        for (String[] grp : groups) {
            System.out.println(Arrays.toString(grp));
        }
    }

    private static String[][] groupAnagram(String[] arr) {
        int m = arr.length;
        boolean[] used = new boolean[m];                     // track visited words
        String[][] temp = new String[m][];                   // upper-bound storage
        int groupCount = 0;

        for (int i = 0; i < m; i++) {
            if (used[i]) continue;

            // 1) count how many in this group
            int count = 1;                                   // include arr[i]
            for (int j = i + 1; j < m; j++) {
                if (!used[j] && areAnagrams(arr[i], arr[j])) {
                    count++;
                }
            }

            // 2) allocate exact array for this group
            String[] group = new String[count];
            int idx = 0;
            used[i] = true;
            group[idx++] = arr[i];

            // 3) collect anagrams into group
            for (int j = i + 1; j < m; j++) {
                if (!used[j] && areAnagrams(arr[i], arr[j])) {
                    used[j] = true;
                    group[idx++] = arr[j];
                }
            }

            // store group and advance
            temp[groupCount++] = group;
        }

        // copy only the used rows into result
        String[][] result = new String[groupCount][];
        System.arraycopy(temp, 0, result, 0, groupCount);
        return result;
    }

    // O(k) check via frequency counts
    private static boolean areAnagrams(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] freq = new int[26];
        for (char c : a.toCharArray()) freq[c - 'a']++;
        for (char c : b.toCharArray()) {
            if (--freq[c - 'a'] < 0) return false;
        }
        return true;
    }
}
