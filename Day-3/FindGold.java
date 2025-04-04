import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGold {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter a Sentence : ");
            String sentence = s.nextLine();
            System.out.println(
                    isGoldInSentence(sentence, "gold") ? "This sentence contain gold!"
                            : "This sentence doesn't contain gold!");
            System.out.println(
                    containsGold(sentence) ? "This sentence contain gold!"
                            : "This sentence doesn't contain gold!");
        }
    }

    private static boolean isGoldInSentence(String sentence, String find) {
        sentence = sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); i++) {
            int k = i, j = 0;
            for (j = 0; j < find.length(); j++) {
                if (sentence.charAt(k) != find.charAt(j)) {
                    break;
                }
                k++;
            }
            if (j == find.length()) {
                return true;
            }
        }
        return false;

    }

    // Using regex to match the word "gold" as a complete word, case-insensitively
    private static boolean containsGold(String sentence) {
        // "\\bgold\\b" ensures we match the whole word "gold" only.
        return sentence.toLowerCase().matches(".*\\bgold\\b.*");
    }
     // This method uses regex to check if the sentence contains "gold"
    // regardless of whether it's a complete word or part of another word.
    private static boolean containsGold1(String sentence) {
        if (sentence == null) return false;
        // Compile a pattern that matches "gold" anywhere in the sentence, case-insensitively.
        Pattern pattern = Pattern.compile("gold", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);
        return matcher.find();
    }

}
