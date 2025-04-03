import java.util.Scanner;

public class FindMaxOccurrenceInLetter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Sentence or Word: ");
            String sentence = sc.nextLine();
            char maxChar = findMaxOccurrence(sentence);
            System.out.println("Max Occurrence Character: " + maxChar);
        }
    }

    private static char findMaxOccurrence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return ' '; // Return space if input is empty
        }

        int[] frequency = new int[256]; // Frequency array for extended ASCII

        // Count frequency of each character
        for (int i = 0; i < sentence.length(); i++) {
            frequency[sentence.charAt(i)]++;
        }

        // Find the character with maximum frequency
        int maxIndex = 0;
        for (int i = 1; i < frequency.length; i++) {
            if (frequency[i] > frequency[maxIndex]) {
                maxIndex = i;
            }
        }
        return (char) maxIndex;
    }
}
