public class AddBinaryStrings {

    /**
     * Adds two binary strings and returns their sum as a binary string.
     * The output string will not have leading zeros unless the result itself is "0".
     *
     * @param s1 The first binary string.
     * @param s2 The second binary string.
     * @return The sum of s1 and s2 as a binary string.
     */
    public static String addBinary(String s1, String s2) {
        // --- Step 1: Get Ready ---
        StringBuilder resultBuilder = new StringBuilder(); // To build the result string
        int carry = 0; // Initialize carry to 0

        // Pointers for s1 and s2, starting from the end
        int i = s1.length() - 1;
        int j = s2.length() - 1;

        // --- Step 2: Loop and Add (Right to Left) ---
        // Loop as long as there are digits in either string or a carry exists
        while (i >= 0 || j >= 0 || carry == 1) {

            // --- Step 2a: Get Current Digits ---
            int digit1 = 0;
            if (i >= 0) {
                digit1 = s1.charAt(i) - '0'; // Convert char '0'/'1' to int 0/1
                i--; // Move pointer for s1
            }

            int digit2 = 0;
            if (j >= 0) {
                digit2 = s2.charAt(j) - '0';
                j--; // Move pointer for s2
            }

            // --- Step 2b: Calculate Sum ---
            int currentSum = digit1 + digit2 + carry;

            // --- Step 2c: Determine Current Bit for Result ---
            int bit = currentSum % 2; // The bit to add to our result
            resultBuilder.insert(0, bit); // Prepend the bit (building from right to left)

            // --- Step 2d: Update Carry ---
            carry = currentSum / 2; // The new carry for the next iteration
        }
        // --- Step 2e: Move Pointers (done implicitly by i-- and j--) ---

        // --- Step 3: Final Touches (Leading Zeros) ---
        // The problem states the output should not have leading zeros.
        // Our prepend method naturally handles this unless the result is just "0".
        // If resultBuilder is empty, it means inputs were "0" and "0" or empty, result is "0".
        if (resultBuilder.length() == 0) {
            return "0";
        }

        // Remove leading zeros if the string is not just "0"
        // This loop is actually not strictly necessary with the current prepend logic
        // if the loop condition `|| carry == 1` is handled correctly for the very last bit.
        // However, to be absolutely sure as per the note:
        int firstOneIndex = 0;
        while (firstOneIndex < resultBuilder.length() -1 && resultBuilder.charAt(firstOneIndex) == '0') {
            firstOneIndex++;
        }
        // If after removing leading zeros we are left with an empty string (e.g. input "000", "00")
        // it means the result was effectively "0". The loop condition should handle this.
        // The only case where resultBuilder might be all zeros and not caught by the first "if"
        // is if the inputs were like "0", "0". In that case, resultBuilder will be "0".

        return resultBuilder.substring(firstOneIndex);
    }

    public static void main(String[] args) {
        // Examples from the problem description
        String s1_ex1 = "1101";
        String s2_ex1 = "111";
        System.out.println("Input: s1 = \"" + s1_ex1 + "\", s2 = \"" + s2_ex1 + "\"");
        System.out.println("Output: " + addBinary(s1_ex1, s2_ex1)); // Expected: 10100
        System.out.println("----------");

        String s1_ex2 = "00100";
        String s2_ex2 = "010";
        System.out.println("Input: s1 = \"" + s1_ex2 + "\", s2 = \"" + s2_ex2 + "\"");
        System.out.println("Output: " + addBinary(s1_ex2, s2_ex2)); // Expected: 110
        System.out.println("----------");

        // Additional test cases
        String s1_ex3 = "1";
        String s2_ex3 = "1";
        System.out.println("Input: s1 = \"" + s1_ex3 + "\", s2 = \"" + s2_ex3 + "\"");
        System.out.println("Output: " + addBinary(s1_ex3, s2_ex3)); // Expected: 10
        System.out.println("----------");

        String s1_ex4 = "0";
        String s2_ex4 = "0";
        System.out.println("Input: s1 = \"" + s1_ex4 + "\", s2 = \"" + s2_ex4 + "\"");
        System.out.println("Output: " + addBinary(s1_ex4, s2_ex4)); // Expected: 0
        System.out.println("----------");

        String s1_ex5 = "1010";
        String s2_ex5 = "1011";
        System.out.println("Input: s1 = \"" + s1_ex5 + "\", s2 = \"" + s2_ex5 + "\"");
        System.out.println("Output: " + addBinary(s1_ex5, s2_ex5)); // Expected: 10101
        System.out.println("----------");
        
        String s1_ex6 = "000";
        String s2_ex6 = "0000";
        System.out.println("Input: s1 = \"" + s1_ex6 + "\", s2 = \"" + s2_ex6 + "\"");
        System.out.println("Output: " + addBinary(s1_ex6, s2_ex6)); // Expected: 0
        System.out.println("----------");
    }
}
