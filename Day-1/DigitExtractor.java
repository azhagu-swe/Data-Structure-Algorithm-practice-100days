import java.util.Arrays;
import java.util.Scanner;

public class DigitExtractor {

    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int number = Math.abs(scanner.nextInt()); // Read input & take absolute value

            if (number == 0) { // Edge case: If input is 0
                System.out.println("Extracted digits: [0]");
                System.out.println("Reverse Number: 0");
                System.out.println("Sum of Digits: 0");
                System.out.println("Sum of Prime Digits: 0");
                return;
            }

            String numStr = String.valueOf(number); // Convert number to string for easy processing
            int[] digits = new int[numStr.length()]; // Initialize array dynamically
            int reverseNumber = 0, sumOfDigits = 0, sumOfPrimeDigits = 0;

            // Processing each digit
            for (int i = 0; i < numStr.length(); i++) {
                // int digit = numStr.charAt(i) - '0'; // Convert char to int
                int digit = Character.getNumericValue(numStr.charAt(i));
                digits[i] = digit;
                reverseNumber = (reverseNumber * 10) + digit;
                sumOfDigits += digit;
                if (isPrime(digit))
                    sumOfPrimeDigits += digit; // Check prime digits
            }

            // Print results
            System.out.println("Extracted digits: " + Arrays.toString(digits));
            System.out.println("Reverse Number: " + reverseNumber);
            System.out.println("Sum of Digits: " + sumOfDigits);
            System.out.println("Sum of Digits using Arrays: " + Arrays.stream(digits).sum());
            System.out.println("Sum of Prime Number Digits: " + sumOfPrimeDigits);
            System.out.println("Number of Digits : " + (digits.length));
        }
    }

    // Helper method to check if a digit is prime
    private static boolean isPrime(int num) {
        return num == 2 || num == 3 || num == 5 || num == 7;
    }
}
