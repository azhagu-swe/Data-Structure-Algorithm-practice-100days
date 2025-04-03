import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        String sentence;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the Sentence : ");

            sentence = scanner.nextLine();
            System.out.println("Give Sentence word count is : " + getWordCount(sentence));
            // Alternative way
            System.out.println("Word Count : " + getWordCount2(sentence));

            // Another way
            System.out.println("Word count  : " + sentence.split(" ").length);

        }
    }

    private static int getWordCount(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
            // Alternative Way
            // if (Character.isWhitespace(sentence.charAt(i))) {
            // count++;
            // }
        }
        return count;

    }

    private static int getWordCount2(String sentence) {
        // Trim the sentence to remove leading/trailing spaces and check if it's empty
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        // Split by one or more whitespace characters
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}
