import java.util.Scanner;

public class FindGold {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter a Sentence : ");
            String sentence = s.nextLine();
            System.out.println(
                    isGoldInSentence(sentence, "gold") ? "This sentence contain gold!"
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

}
