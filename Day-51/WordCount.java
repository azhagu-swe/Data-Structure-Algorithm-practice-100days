public class WordCount {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence to count words";
        int wordCount = countWords(sentence);

        String words[] =sentence.trim().split("\\s+");

        System.out.println("Number of words in the sentence: " + wordCount);
                
        System.out.println("Number of words in the sentence: " + words.length);
    }

    /**
     * Counts the number of words in the given sentence.
     * A word is any contiguous sequence of ASCII letters or digits.
     *
     * @param s Input sentence (may be null or blank)
     * @return Number of words (0 if none)
     */
    public static int countWords(String s) {
        if (s == null || s.isBlank()) {
            return 0;
        }

        int count = 0;
        boolean inWord = false;

        for (int i = 0, n = s.length(); i < n; i++) {
            char c = s.charAt(i);
            // manual alphanumeric check (A–Z, a–z, 0–9)
            boolean isAlnum = (c >= 'A' && c <= 'Z')
                    || (c >= 'a' && c <= 'z')
                    || (c >= '0' && c <= '9');

            if (isAlnum) {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        return count;
    }
}
