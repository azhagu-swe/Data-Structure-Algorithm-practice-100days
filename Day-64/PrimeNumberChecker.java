// Check if a Number is Prime
// Write a Java program to check if a given number is prime or not.

// Here’s a Java program to check if a given number is prime:
public class PrimeNumberChecker {
    public static void main(String[] args) {
        int num = 29; // Example number
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;
        for (int i = 5; i < num / 2; i++) {
            if (num % i == 0)
                return false;

        }

        return true;
    }

}
