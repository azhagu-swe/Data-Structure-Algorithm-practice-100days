// Given an array containing n distinct numbers taken from 0, 1, 2, …, n, find the one that is missing from the array.

// To find the missing number in an array containing distinct numbers taken from 0 to n, you can utilize the concept of arithmetic progression and Gauss’s formula. Here’s a Java program to find the missing number:

import java.util.Arrays;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] nums = { 3, 0, 1, 5, 2, 6, 4 }; // Example array

        int missing = findMissingNumber(nums);
        System.out.println(missing);
    }

    private static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(nums).sum();
        return expectedSum - actualSum;
    }

}
