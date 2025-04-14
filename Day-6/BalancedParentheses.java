import java.util.Scanner;

public class BalancedParentheses {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string with parentheses: ");
            String input = scanner.nextLine();

            System.out.println(isBalanced(input));
        }
    }

    private static int isBalanced(String input) {
        int balance = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(') {
                balance++;
            } else if (ch == ')') {
                // More ')' than '(' so far — invalid
                if (balance == 0) {
                    return 1;
                }
                balance--;
            }
        }

        // If balance is not zero, then unmatched '(' remain
        return balance == 0 ? 0 : 1;
    }
}

