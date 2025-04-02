import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            int number = scanner.nextInt();
            System.out.println(
                    number + (isPerfectNumber(number) ? " is a Perfect Number!" : " is Not a Perfect Number!"));
        }
    }

    private static boolean isPerfectNumber(int number) {
        if (number < 2)
            return false; // Perfect numbers are positive and greater than 1

        int sum = 1; // Start sum with 1 (since every number is divisible by 1)
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) { // Add the corresponding divisor
                    sum += number / i;
                }
            }
        }
        return sum == number;
    }
}
