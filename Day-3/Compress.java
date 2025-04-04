import java.util.Scanner;

public class Compress {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String sentence = scanner.nextLine().toLowerCase();
            System.out.println(getCompressedString(sentence));
        }
    }

    private static String getCompressedString(String sentence) {
        int[] freq = new int[26]; // Only for lowercase a-z
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                output.append((char) ('a' + i)).append(freq[i]);
            }
        }

        return output.toString();
    }
}
