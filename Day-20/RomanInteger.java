
import java.util.HashMap;
import java.util.Map;

class RomanInteger {
    /**
     * Converts a Roman numeral string to its integer representation.
     *
     * Analogy: Decoding a secret letter code where letters have point values,
     * but sometimes a smaller value before a larger one means subtraction.
     * Uses a right-to-left traversal approach.
     *
     * @param s The Roman numeral string (e.g., "III", "LVIII", "MCMXCIV").
     *          Constraints: 1 <= s.length <= 15, contains only valid Roman chars,
     *          represents a number between 1 and 3999.
     * @return The integer value of the Roman numeral.
     */
    public int romanToInt(String s) {
        // Create a map to easily get the integer value for each Roman symbol.
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        // Initialize the total result with the value of the last character in the
        // string.
        // We start from the right end.
        int total = romanValues.get(s.charAt(s.length() - 1));

        // Iterate backwards through the string, starting from the second-to-last
        // character.
        for (int i = s.length() - 2; i >= 0; i--) {
            // Get the value of the current character (moving left).
            int currentValue = romanValues.get(s.charAt(i));
            // Get the value of the character to its right (which we processed in the
            // previous step).
            int previousValue = romanValues.get(s.charAt(i + 1));

            // Compare current value with the value to its right.
            if (currentValue < previousValue) {
                // If current value is smaller, it's a subtraction case (like 'I' in 'IV' or 'X'
                // in 'XC').
                // Analogy: This is a "takeaway" signal! Subtract the points.
                total -= currentValue;
            } else {
                // Otherwise, it's an addition case (like 'L' in 'LVIII' or the second 'I' in
                // 'III').
                // Analogy: Just add the points normally.
                total += currentValue;
            }
        }

        // After iterating through the whole string, 'total' holds the final integer
        // value.
        return total;
    }

    // Example Usage (optional, for testing)
    public static void main(String[] args) {
        RomanInteger sol = new RomanInteger();

        System.out.println("Input: III, Output: " + sol.romanToInt("III")); // Expected: 3
        System.out.println("Input: LVIII, Output: " + sol.romanToInt("LVIII")); // Expected: 58
        System.out.println("Input: MCMXCIV, Output: " + sol.romanToInt("MCMXCIV")); // Expected: 1994
        System.out.println("Input: IX, Output: " + sol.romanToInt("IX")); // Expected: 9
        System.out.println("Input: IV, Output: " + sol.romanToInt("IV")); // Expected: 4
    }
}
