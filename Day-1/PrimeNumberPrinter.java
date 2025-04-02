import java.util.Scanner;

public class PrimeNumberPrinter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Start Number: ");
            int start = scanner.nextInt();
            System.out.print("Enter End Number: ");
            int end = scanner.nextInt();

            if (start < 2) start = 2; // Primes start from 2
            
            int[] primes = getPrimeNumbers(start, end);
            
            System.out.print("Prime Numbers: ");
            for (int prime : primes) {
                if (prime != 0) {
                    System.out.print(prime + " ");
                }
            }
        }
    }

    private static int[] getPrimeNumbers(int start, int end) {
        int[] primeNumbers = new int[end - start + 1]; // Fixed array size
        int index = 0;
        
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                primeNumbers[index++] = num;
            }
        }
        
        return primeNumbers;
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false; // Skip even numbers except 2

        for (int i = 3; i * i <= num; i += 2) { // Check odd divisors only
            if (num % i ==0 ) return false;
        }
        
        return true;
    }
}
