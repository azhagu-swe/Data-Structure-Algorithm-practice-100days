
// Eg 1:Input:
//         String 1: test123string
//          String 2: 123
//         Output: 4
// Eg 2: Input:
//         String 1: testing12
//         String 2: 1234 
//         Output: -1
import java.util.Scanner;

public class StringFirstOccurrence {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a word1 : ");
            String word1 = scanner.nextLine();
            System.out.print("Enter a word1 : ");
            String word2 = scanner.nextLine();
            System.out.println("Output : " + firstOccurence(word1, word2));

        }
    }

    private static int firstOccurence(String word1, String word2) {
        int w1Length = word1.length(), w2Length = word2.length();
        if (w1Length < w2Length)
            return -1;
        for (int i = 0; i < w1Length - w2Length; i++) {
            int j;
            for (j = 0; j < w2Length; j++) {
                if (word1.charAt(i + j) != word2.charAt(j))
                    break;
            }
            if (j == w2Length)
                return i;
        }
        return -1;

    }

}
