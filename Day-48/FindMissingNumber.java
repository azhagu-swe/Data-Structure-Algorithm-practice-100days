// Find the Missing Number
// Given an array containing n distinct numbers taken from 0, 1, 2, …, n, find the one that is missing from the array.

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 7, 5, 2, 6, 4 };

        long exceptedSum = (arr.length * (arr.length + 1)) / 2;
        long actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        System.out.println(exceptedSum - actualSum);
        int missingNumberXor = 0;
        for (int i = 0; i <= arr.length; i++) {
            missingNumberXor ^= i;
        }
        for (int num : arr) {
            missingNumberXor ^= num;

        }
        System.out.println("Missing Number is : " + missingNumberXor);

    }

}
