
// Check if two Strings are Anagrams of each other
// Input: s1 = “allergy”  s2 = “allergic”
// Output: false
// Explanation: Characters in both the strings are not same. s1 has extra character 'y' and s2 has extra characters 'i' and 'c', so they are not anagrams.

// Input: s1 = "g", s2 = "g"
// Output: true
// Explanation: Characters in both the strings are same, so they are anagrams.

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the first string: ");
            String firstString = scanner.nextLine();
            System.out.println("Enter the second string: ");
            String secondString = scanner.nextLine();

            boolean isAnagram = checkAnagram(firstString, secondString);
            System.out.println("These words are " + (isAnagram ? "Anagrams." : "not Anagrams."));
        }
    }

    private static boolean checkAnagram(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length())
            return false;

        int[] charCount = new int[26];
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i) - 'a']++;
            charCount[s2.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
