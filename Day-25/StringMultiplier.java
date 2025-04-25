import java.util.Scanner;

/**
 * Utility to multiply two non-negative decimal numbers represented as Strings,
 * without using the '*' operator. Parsing uses bit-shifts; multiplication
 * uses the Russian-peasant algorithm in O(log n) time.
 */
public class StringMultiplier {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first non-negative integer: ");
            String inputA = scanner.nextLine().trim();

            System.out.print("Enter second non-negative integer: ");
            String inputB = scanner.nextLine().trim();

            int product = multiplyStrings(inputA, inputB);
            System.out.println("Product = " + product);
        }
    }

    /**
     * Parses two decimal strings and multiplies them.
     * 
     * @param aStr first decimal string
     * @param bStr second decimal string
     * @return product as int
     * @throws NumberFormatException if inputs contain non-digit chars
     */
    public static int multiplyStrings(String aStr, String bStr) {
        int a = parseDecimal(aStr);
        int b = parseDecimal(bStr);
        if (a == 0 || b == 0) {
            return 0;
        }
        return russianPeasantMultiply(a, b);
    }

    /**
     * Parses a non-negative decimal string into an int using only
     * bit-shifts and addition: x*10 == (x<<3)+(x<<1).
     * 
     * @param s decimal string
     * @return integer value
     * @throws NumberFormatException on invalid chars
     */
    private static int parseDecimal(String s) {
        int result = 0;
        for (char ch : s.toCharArray()) {
            if (ch < '0' || ch > '9') {
                throw new NumberFormatException("Invalid digit '" + ch + "' in input.");
            }
            // result = result*10 + digit → (result<<3)+(result<<1)+(ch-'0')
            result = (result << 3) + (result << 1) + (ch - '0');
        }
        return result;
    }

    /**
     * Multiplies two ints using the Russian-peasant algorithm (shift-and-add).
     * Time: O(log b), Space: O(1).
     * 
     * @param x multiplicand
     * @param y multiplier
     * @return x*y
     */
    private static int russianPeasantMultiply(int x, int y) {
        int product = 0;
        while (y > 0) {
            if ((y & 1) == 1) {
                product += x;
            }
            x <<= 1; // x = x*2
            y >>= 1; // y = y/2
        }
        return product;
    }
}
