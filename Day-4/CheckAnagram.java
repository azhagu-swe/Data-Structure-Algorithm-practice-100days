import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the First String: ");
            String word = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();
            System.out.print("Enter the Anagram String: ");
            String anagram = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

            System.out.println(
                    isAnagramByCounting(word, anagram)
                            ? "Perfectly matched!"
                            : "Not matched, try next time");
        }
    }

    private static boolean isAnagramByCounting(String a, String b) {
        if (a.length() != b.length())
            return false;
        int[] freq = new int[26];
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0)
                return false;
        }
        return true;
    }
}
