
// Write a program that prints the numbers from 1 to 100. But for multiples of three, 
// print “Fizz” instead of the number, and for the multiples of five, print “Buzz”. 
// For numbers that are multiples of both three and five, print “FizzBuzz”.

import java.util.stream.IntStream;

public class FizzBuzzProblemStream {
    public static void main(String[] args) {
        IntStream.range(1, 100).forEach(i -> {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 3 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);

        });

        IntStream.rangeClosed(1, 100).mapToObj(i -> {
            if (i % 3 == 0 && i % 5 == 0)
                return "FizzBuzz";
            else if (i % 3 == 0)
                return "Fizz";
            else if (i % 5 == 0)
                return "Buzz";
            else
                return String.valueOf(i);

        }).forEach(System.out::println);
    }

}