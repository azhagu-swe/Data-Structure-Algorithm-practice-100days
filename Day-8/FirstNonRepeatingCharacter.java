import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            char result = findFirstNonRepeatingCharacter(input);
            if (result != '\0') {
                System.out.println("First non-repeating character: " + result);
            } else {
                System.out.println("-1");
            }
        }
    }

    private static char findFirstNonRepeatingCharacter(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count frequency of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with frequency 1
        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }

        return '\0'; // Return '\0' if no non-repeating character is found
    }
}
