import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            int number = scanner.nextInt();
            System.out.println(isPalindrome(number) ? "Palindrome!" : "Not Palindrome!");
        }
    }

    private static boolean isPalindrome(int number) {
        if (number < 0)
            return false; // Negative numbers can't be palindromes

        int reversed = 0, original = number;
        while (number > 0) {
            reversed = (reversed * 10) + (number % 10);
            number /= 10;
        }

        return original == reversed;
    }
}
