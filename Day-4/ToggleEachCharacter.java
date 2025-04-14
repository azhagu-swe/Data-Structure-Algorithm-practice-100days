import java.util.Scanner;

public class ToggleEachCharacter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your sentence: ");
            String sentence = scanner.nextLine();
            System.out.println("Output: " + toggleCase(sentence));
        }
    }

    private static String toggleCase(String input) {
        StringBuilder sb = new StringBuilder(input.length());
        for (int i = 0, len = input.length(); i < len; i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                // lower → upper
                sb.append((char) (c - 'a' + 'A'));
            } else if (c >= 'A' && c <= 'Z') {
                // upper → lower
                sb.append((char) (c - 'A' + 'a'));
            } else {
                // non‑letter unchanged
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
