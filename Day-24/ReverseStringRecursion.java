// Using Recursion reverse the string such as


// Eg 1: Input: one two three
//       Output: three two one
// Eg 2: Input: I love india
//       Output: india love I 

import java.util.Scanner;

public class ReverseStringRecursion {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a String  : ");
            String input = scanner.nextLine();
            System.out.println("Output : " + reverseString(input));
        }
    }

    // Public API: start recursion from the end of the string
    private static String reverseString(String s) {
        return reverseHelper(s, s.length() - 1);
    }

    // Recursive helper operating on character indices only
    private static String reverseHelper(String s, int end) {
        // Base case: no characters left
        if (end < 0) {
            return "";
        }
        // 1) Find the start of the last word by scanning backwards
        int i = end;
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
        }
        // 2) Build the last word manually, char by char
        String word = "";
        for (int j = i + 1; j <= end; j++) {
            word += s.charAt(j);
        }
        // 3) Recurse on the prefix before that word
        if (i > 0) {
            return word + " " + reverseHelper(s, i - 1);
        } else {
            return word;
        }
    }
}
