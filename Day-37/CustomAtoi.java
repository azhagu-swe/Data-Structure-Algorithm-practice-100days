public class CustomAtoi {

    /**
     * Converts a string to an integer based on atoi rules, without using built-in parsing functions.
     * Handles leading whitespaces, signs, non-digit characters, and integer overflow.
     *
     * @param s The input string.
     * @return The converted integer, or Integer.MAX_VALUE/Integer.MIN_VALUE on overflow, or 0 if no digits.
     */
    public static int myAtoi(String s) {
        // Handle null or empty string early
        if (s == null || s.length() == 0) {
            return 0;
        }

        // --- Step 1: Initialization ---
        int index = 0;          // Current position in the string
        int sign = 1;           // 1 for positive (default), -1 for negative
        long result = 0;        // Use long to detect overflow before it happens with int

        // --- Step 2: Skip Leading Whitespaces ---
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        // --- Step 3: Check for Sign (+/-) ---
        // Check if we've reached the end of the string after whitespaces
        if (index < s.length()) {
            if (s.charAt(index) == '-') {
                sign = -1;
                index++;
            } else if (s.charAt(index) == '+') {
                index++;
            }
        }

        // --- Step 4: Read Digits and Build Number (with Overflow Check) ---
        while (index < s.length()) {
            char currentChar = s.charAt(index);

            // Check if the character is a digit
            if (currentChar >= '0' && currentChar <= '9') {
                int digit = currentChar - '0'; // Convert char '0'-'9' to int 0-9

                // Append the digit to the result
                result = result * 10 + digit;

                // Crucial Overflow Check (after updating result with long)
                // Check if the current result (when signed) exceeds Integer limits
                if (sign == 1 && result > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (sign == -1 && (-1 * result) < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
                // An alternative check before multiplying:
                // if (result > Integer.MAX_VALUE / 10 ||
                //    (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                //     return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                // }
                // result = result * 10 + digit; // This would be the original update position

                index++;
            } else {
                // Non-digit character encountered, stop reading
                break;
            }
        }

        // --- Step 5: Apply Sign and Final Overflow Check/Return ---
        result = result * sign;

        // Final clamp if result (as long) is outside int range but wasn't caught by intermediate checks
        // (This is more robust if the intermediate check was done before multiplication)
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) result; // Cast to int before returning
    }

    public static void main(String[] args) {
        String[] testCases = {
            "-123",
            "  -",
            " 1231231231311133",
            "-999999999999",
            "  -0012gfg4",
            "42",
            "   -42",
            "4193 with words",
            "words and 987",
            "+1",
            "0",
            "  0000000000012345",
            "2147483647",  // Integer.MAX_VALUE
            "2147483648",  // MAX_VALUE + 1
            "-2147483648", // Integer.MIN_VALUE
            "-2147483649", // MIN_VALUE - 1
            "  +  413",    // Stops at second '+'
            "",            // Empty string
            "00000-42a1234" // Test case for leading zeros before sign
        };

        for (String s : testCases) {
            System.out.println("Input: \"" + s + "\" -> Output: " + myAtoi(s));
        }
        // Expected outputs:
        // Input: "-123" -> Output: -123
        // Input: "  -" -> Output: 0
        // Input: " 1231231231311133" -> Output: 2147483647
        // Input: "-999999999999" -> Output: -2147483648
        // Input: "  -0012gfg4" -> Output: -12
        // Input: "42" -> Output: 42
        // Input: "   -42" -> Output: -42
        // Input: "4193 with words" -> Output: 4193
        // Input: "words and 987" -> Output: 0
        // Input: "+1" -> Output: 1
        // Input: "0" -> Output: 0
        // Input: "  0000000000012345" -> Output: 12345
        // Input: "2147483647" -> Output: 2147483647
        // Input: "2147483648" -> Output: 2147483647
        // Input: "-2147483648" -> Output: -2147483648
        // Input: "-2147483649" -> Output: -2147483648
        // Input: "  +  413" -> Output: 0
        // Input: "" -> Output: 0
        // Input: "00000-42a1234" -> Output: 0
    }
}
