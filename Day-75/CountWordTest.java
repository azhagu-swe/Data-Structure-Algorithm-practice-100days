public class CountWordTest {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence to   count words"; // Example sentence

        int wordCount = countWords(sentence);
        System.out.println(wordCount);
        int count = sentence.trim().split("\\s+").length;
        System.out.println(count);

    }

    private static int countWords(String sentence) {
        int wordCount = 0;
        boolean isWordIn = false;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                if(!isWordIn){
                    wordCount++;
                    isWordIn=true;
                }
            }else{
                isWordIn=false;
            }
        }
        return wordCount;
    }

}
