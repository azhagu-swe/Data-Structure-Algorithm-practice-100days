// Given an array containing n distinct numbers 
// taken from 0, 1, 2, …, n, find the one that is missing from the array.

import java.util.List;
import java.util.stream.IntStream;

public class FindingMissingNumber {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 7);

        int n = numbers.size() + 1; // Total numbers including the missing one

        // Sum of all numbers from 1 to n
        int expectedSum = IntStream.rangeClosed(1, n).sum();

        // Sum of elements in the given list
        int actualSum = numbers.stream().mapToInt(Integer::intValue).sum();

        // Missing number is the difference between the expected and actual sum
        int missingNumber = expectedSum - actualSum;

        System.out.println("The missing number is: " + missingNumber);

    }

}
