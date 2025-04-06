import java.util.Scanner;

public class Pangram {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a sentence : ");
            String sentence = scanner.nextLine().toLowerCase();

            System.out.println("Pangram is " + (isPangram(sentence)));
        }
    }

    private static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26]; // To track a-z

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        // Check if all characters a-z are marked as true
        for (boolean letterPresent : alphabet) {
            if (!letterPresent)
                return false;
        }

        return true;
    }
}
