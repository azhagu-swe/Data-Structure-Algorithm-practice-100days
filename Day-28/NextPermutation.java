// Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 

// Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.

// Examples:

// Input: arr = [2, 4, 1, 7, 5, 0]
// Output: [2, 4, 5, 0, 1, 7]
// Explanation: The next permutation of the given array is {2, 4, 5, 0, 1, 7}.
// Input: arr = [3, 2, 1]
// Output: [1, 2, 3]
// Explanation: As arr[] is the last permutation, the next permutation is the lowest one.

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 7, 5, 0 };

        int n = arr.length;
        // 1) Find pivot
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        // 2) If pivot exists, find successor and swap
        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            // swap pivot and successor
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        // 3) Reverse suffix starting at i+1
        int left = i + 1, right = n - 1;
        while (left < right) {
            int tmp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }

}
