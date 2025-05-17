// 1. FizzBuzz Problem
// Write a program that prints the numbers from 1 to 100. But for multiples of three, print “Fizz” instead of the number, and for the multiples of five, print “Buzz”. For numbers that are multiples of both three and five, print “FizzBuzz”.
import java.util.Scanner;
import java.util.stream.IntStream;

public class BuzzFizz {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 1) First pass with Streams
        doStreamFizzBuzz();

        // 2) Then classic for‑loop
        System.out.print("Enter another number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if      (i % 15 == 0) System.out.println("BuzzFizz");
            else if (i % 3  == 0) System.out.println("Buzz");
            else if (i % 5  == 0) System.out.println("Fizz");
            else                  System.out.println(i);
        }
        scanner.close();

        // NOTE: we never close(scanner) so System.in stays open
    }

    private static void doStreamFizzBuzz() {
        System.out.print("Enter a number for streams: ");
        int n = scanner.nextInt();
        IntStream.rangeClosed(1, n)
                 .mapToObj(i -> (i%15==0) ? "FizzBuzz"
                                         : (i%3==0)  ? "Fizz"
                                         : (i%5==0)  ? "Buzz"
                                                     : Integer.toString(i))
                 .forEach(System.out::println);
    }
}

