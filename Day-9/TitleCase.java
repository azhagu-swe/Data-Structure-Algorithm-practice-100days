public class TitleCase {
    public static String toTitleCase(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    result.append(word.substring(1).toLowerCase());
                }
                result.append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello world";
        System.out.println(toTitleCase(input)); // Output: "Hello World"
    }
}