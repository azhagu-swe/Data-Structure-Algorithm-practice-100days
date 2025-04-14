import java.util.Scanner;

public class ReverseWordsInString {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();
            System.out.println("Reversed sentence: " + reverseWords(sentence));
        }
    }

    private static String reverseWords(String sentence) {
        // Trim the sentence to remove extra leading/trailing spaces
        sentence = sentence.trim();
        // Split the sentence into words using space as delimiter.
        // This approach uses built-in split, which is acceptable since we're focusing on basic logic.
        String[] words = sentence.split("\\s+");
        
        // Reverse the order of words manually using a simple loop
        int n = words.length;
        for (int i = 0; i < n / 2; i++) {
            // Swap words[i] and words[n - 1 - i]
            String temp = words[i];
            words[i] = words[n - 1 - i];
            words[n - 1 - i] = temp;
        }
        
        // Join the reversed words with a single space
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = 0; i < n; i++) {
            reversedSentence.append(words[i]);
            if (i < n - 1) {
                reversedSentence.append(" ");
            }
        }
        
        return reversedSentence.toString();
    }
}
