import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Two-Digit Number: ");
            int number = scanner.nextInt();

            // Validate input: Ensure it's a two-digit number
            if (number < 10 || number > 99) {
                System.out.println("Invalid input! Please enter a two-digit number.");
                return;
            }

            System.out.println(
                    number + (isSpecialNumber(number) ? " is a Special Number!" : " is Not a Special Number!"));
        }
    }

    private static boolean isSpecialNumber(int number) {
        int firstDigit = number / 10; // Extract tens place
        int secondDigit = number % 10; // Extract units place

        return (firstDigit + secondDigit + firstDigit * secondDigit) == number;
    }
}
