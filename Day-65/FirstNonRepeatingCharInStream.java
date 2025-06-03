import java.util.*;

public class FirstNonRepeatingCharInStream {
    public static void main(String[] args) {
        String stream = "aabcbd";
        printFirstNonRepeating(stream);
    }

    private static void printFirstNonRepeating(String stream) {
        Queue<Character> queue = new LinkedList<>();
        int[] charCount = new int[26]; // Assuming lowercase English letters

        for (char c : stream.toCharArray()) {
            // Update the count of the character
            charCount[c - 'a']++;

            // Add the character to the queue
            queue.add(c);

            // Remove characters from the queue that are not non-repeating
            while (!queue.isEmpty() && charCount[queue.peek() - 'a'] > 1) {
                queue.poll();
            }

            // Print the first non-repeating character, or -1 if none exists
            if (queue.isEmpty()) {
                System.out.print("#");
            } else {
                System.out.print(queue.peek() + "");
            }
        }
    }
}
