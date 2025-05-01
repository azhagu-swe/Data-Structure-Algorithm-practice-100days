import java.util.Scanner;

public class NumberSystem34 {

    /**
     * Finds the nth number in a number system containing only digits 3 and 4.
     * This method uses a modified base-2 conversion approach.
     *
     * @param n The position of the number to find (1-based index).
     * @return The nth number in the sequence as a String.
     */
    public static String findNthNumber(int n) {
        // Use StringBuilder for efficient string building, especially prepending
        StringBuilder numberStr = new StringBuilder();

        // Handle edge case for n <= 0 if necessary, though the loop condition covers it
        if (n <= 0) {
            return ""; // Or throw an exception, depending on requirements
        }

        // --- Step 2: Loop while n is greater than 0 ---
        while (n > 0) {
            // --- Step 2a: Adjust n ---
            // Subtract 1 to align 1-based indexing (1st, 2nd, ...)
            // with 0-based indexing used by modulo operator (remainder 0 or 1).
            int adjustedN = n - 1;

            // --- Step 2b: Find Remainder ---
            // Find the remainder when divided by 2. This determines the current digit.
            int remainder = adjustedN % 2;

            // --- Step 2c & 2d: Choose Digit and Add to Front ---
            if (remainder == 0) {
                // Remainder 0 maps to digit '3'
                numberStr.insert(0, '3'); // Prepend '3' to the beginning
            } else {
                // Remainder 1 maps to digit '4'
                numberStr.insert(0, '4'); // Prepend '4' to the beginning
            }

            // --- Step 2e: Update n ---
            // Update n for the next iteration using integer division by 2
            // on the adjusted value. This effectively shifts to the next "binary" position.
            n = adjustedN / 2;

        } // --- End of Loop ---

        // --- Step 3: Finish ---
        // The loop terminates when n becomes 0.
        // The StringBuilder now holds the constructed number.
        return numberStr.toString();
    }

    // Main method for testing the function
    public static void main(String[] args) {
        // Test cases from the description or examples
        int[] testCases = { 1, 2, 3, 4, 5, 6, 7, 8, 15 }; // 15th should be 3333

        System.out.println("Finding numbers in the 3-4 system:");
        for (int n : testCases) {
            String result = findNthNumber(n);
            System.out.println("The " + n + "th number is: " + result);
        }

        // Example: Find the 5th number (from the guide)
        // Expected: 43
        int n5 = 5;
        System.out.println("\nExample from guide:");
        System.out.println("The " + n5 + "th number is: " + findNthNumber(n5));

        // Example: Find the 7th number (from the guide)
        // Expected: 333
        int n7 = 7;
        System.out.println("The " + n7 + "th number is: " + findNthNumber(n7));

        // Allow user input
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("\nEnter the value of n: ");
        // int userN = scanner.nextInt();
        // if (userN > 0) {
        // System.out.println("The " + userN + "th number is: " + findNthNumber(userN));
        // } else {
        // System.out.println("Please enter a positive integer for n.");
        // }
        // scanner.close();
    }
}
