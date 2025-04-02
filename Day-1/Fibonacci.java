import java.util.Scanner;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            int number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Invalid input! Enter a positive integer.");
            } else {
                System.out.println(Arrays.toString(getFibonacci(number)));
            }
        }
    }

    private static int[] getFibonacci(int number) {
        int[] fibonacciNumbers = new int[number]; // Dynamically allocate exact size
        if (number >= 1)
            fibonacciNumbers[0] = 0;
        if (number >= 2)
            fibonacciNumbers[1] = 1;

        for (int i = 2; i < number; i++) { // Corrected loop condition
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        return fibonacciNumbers;
    }
}
