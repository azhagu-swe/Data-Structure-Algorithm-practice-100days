
import java.util.Scanner;
import java.util.HashMap;

public class FibonacciRecursion {
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            int number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Invalid input! Enter a positive integer.");
            } else {
                System.out.print("Fibonacci Series: ");
                for (int i = 0; i < number; i++) {
                    System.out.print(fibonacci(i) + " ");
                }
                System.out.println();
            }
        }
    }

    private static int fibonacci(int n) {
        if (n == 0)
            return 0; // Base case 1
        if (n == 1)
            return 1; // Base case 2

        // If already computed, return from memo
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }
}
