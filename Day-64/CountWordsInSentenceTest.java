// Count Words in a Sentence
// Write a Java program to count the number of words in a given sentence.

// Here’s a Java program to count the number of words in a given sentence:
public class CountWordsInSentenceTest {

    public static void main(String[] args) {
        String sentence = "This is a sample sentence to count words"; // Example sentence
        int wordCount = sentence.trim().split("\\s+").length;

        System.out.println("Number of words in the sentence: " + wordCount);
        // manul word count
        int wordCounts = countWords(sentence);
        System.out.println("Number of words in the sentence: " + wordCounts);

    }

    private static int countWords(String sentence) {
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isWhitespace(sentence.charAt(i))) {
                inWord = false;
            } else if (!inWord) {
                inWord = true;
                wordCount++;
            }

        }
        return wordCount;
    }
}
