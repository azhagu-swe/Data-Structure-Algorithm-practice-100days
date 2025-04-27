// Input: arr[] = [“act”, “god”, “cat”, “dog”, “tac”]
// Output: [[“act”, “cat”, “tac”], [“god”, “dog”]]
// Explanation: There are 2 groups of anagrams “god”, “dog” make group 1. “act”, “cat”, “tac” make group 2.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnagramGroupingNoBuiltins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter words separated by spaces: ");
        String line = sc.nextLine().trim();
        sc.close();

        // split manually on spaces (no String.split)
        List<String> temp = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (char c : line.toCharArray()) {
            if (c == ' ') {
                if (sb.length() > 0) {
                    temp.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(c);
            }
        }
        if (sb.length() > 0)
            temp.add(sb.toString());

        String[] words = temp.toArray(new String[0]);
        List<List<String>> result = groupAnagramsBruteForce(words);
 
        System.out.println(result);
    }

    private static boolean areAnagrams(String a, String b) {
        if (a.length() != b.length())
            return false;
        int[] freq = new int[26];
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            if (--freq[b.charAt(i) - 'a'] < 0)
                return false;
        }
        return true;
    }

    public static List<List<String>> groupAnagramsBruteForce(String[] words) {
        int m = words.length;
        boolean[] used = new boolean[m];
        List<List<String>> groups = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            if (used[i])
                continue;
            used[i] = true;
            List<String> group = new ArrayList<>();
            group.add(words[i]);

            for (int j = i + 1; j < m; j++) {
                if (!used[j] && areAnagrams(words[i], words[j])) {
                    used[j] = true;
                    group.add(words[j]);
                }
            }
            groups.add(group);
        }
        return groups;
    }  
}
