// FizzBuzz Problem
// Write a program that prints the numbers from 1 to 100. But for multiples of three, print “Fizz” instead of the number, and for the multiples of five, print “Buzz”. For numbers that are multiples of both three and five, print “FizzBuzz”.

import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
        if (i % 3 == 0 && i % 5 == 0)
        System.out.println(i + " : FizzBuzz");
        else if (i % 3 == 0)
        System.out.println(i + " : Fizz");
        else if (i % 5 == 0)
        System.out.println(i + " : Buzz");
        else
        System.out.println(i);
        }

        IntStream.rangeClosed(1, 100).forEach(i -> {
        if (i % 3 == 0 && i % 5 == 0)
        System.out.println(i + " : FizzBuzz");
        else if (i % 3 == 0)
        System.out.println(i + " : Fizz");
        else if (i % 5 == 0)
        System.out.println(i + " : Buzz");
        else
        System.out.println(i);
        });
        IntStream.rangeClosed(1, 100).forEach(i -> {
        if (i % 3 == 0 && i % 5 == 0)
        System.out.println(i + " : FizzBuzz");
        else if (i % 3 == 0)
        System.out.println(i + " : Fizz");
        else if (i % 5 == 0)
        System.out.println(i + " : Buzz");
        else
        System.out.println(i);
        });
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : i)
                .forEach(System.out::println);

    }
}