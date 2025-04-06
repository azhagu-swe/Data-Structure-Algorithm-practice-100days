import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            System.out.println("Output: " + removeDuplicates(input));
        }
    }

    private static String removeDuplicates(String input) {
        if (input.isEmpty())
            return "";

        StringBuilder result = new StringBuilder();
        char prevChar = input.charAt(0);
        result.append(prevChar);

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != prevChar) {
                result.append(currentChar);
                prevChar = currentChar;
            }
        }

        return result.toString();
    }
}
