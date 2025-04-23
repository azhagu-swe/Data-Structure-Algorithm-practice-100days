
// Write a program to give the following output for the given input

// Eg 1: Input: a1b10
//        Output: abbbbbbbbbb
// Eg: 2: Input: b3c6d15
//           Output: bbbccccccddddddddddddddd
// The number varies from 1 to 99.

import java.util.Scanner;

public class StringExpansion {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a String : ");
            String input = scanner.nextLine();
            String output = stringExpansion(input);
            System.out.println("Expanded String : " + output);
        }

    }

    private static String stringExpansion(String input) {
        StringBuilder output = new StringBuilder();
        int length = input.length();
        int i = 0;

        while (i < length) {
            char letter = input.charAt(i);
            if (isNumber(letter)) {
                throw new IllegalArgumentException("Invalid format: expected a letter at position " + i);
            }
            i++;

            // Parse the count (must have at least one digit)
            if (i >= length || !isNumber(input.charAt(i))) {
                throw new IllegalArgumentException("Invalid format: missing repetition count after '" + letter + "'");
            }
            int count = 0;
            while (i < length && isNumber(input.charAt(i))) {
                count = count * 10 + (input.charAt(i) - '0');
                i++;
            }
            if (count > 99 || count < 0)
                throw new IllegalArgumentException("invalid counts");

            // Append 'letter' count times
            for (int j = 0; j < count; j++) {
                output.append(letter);
            }
        }

        return output.toString();
    }

    private static boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }

}
