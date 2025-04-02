import java.util.Scanner;

public class NivenNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the Number: ");
            int number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Invalid input! Enter a positive integer.");
                return;
            }

            System.out.println(number + (isNivenNumber(number) ? " is a Niven Number" : " is Not a Niven Number"));
        }
    }

    private static boolean isNivenNumber(int number) {
        int sum = 0, temp = number;

        // Calculate sum of digits
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return (sum > 0 && number % sum == 0); // Prevent division by zero
    }
}
