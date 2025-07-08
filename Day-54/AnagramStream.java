import java.util.Arrays;
import java.util.Scanner;

public class AnagramStream {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the first string: ");
            String firstString = scanner.nextLine();
            System.out.println("Enter the second string: ");
            String secondString = scanner.nextLine();

            boolean isAnagram = checkAnagramWithStream(firstString, secondString);
            System.out.println("These words are " + (isAnagram ? "Anagrams." : "not Anagrams."));
        }
    }

    private static boolean checkAnagramWithStream(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length())
            return false;

        // Convert strings to lowercase, sort them, and compare
        // return s1.toLowerCase().chars().sorted().toArray() ==
        // s2.toLowerCase().chars().toArray();
        
        // Convert strings to lowercase, sort their character streams, and compare the
        // arrays

        return Arrays.equals(s1.toLowerCase().chars().sorted().toArray(), s2.toLowerCase().chars().toArray());

    }
}
