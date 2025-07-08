// Given two sorted arrays a[] and b[] of size n and m respectively, the task is to merge them in sorted order without using any extra space. Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements.

// Examples:

// Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
// Output:
// 2 2 3 4
// 7 10
// Explanation: After merging the two non-decreasing arrays, we get, 2 2 3 4 7 10
// Input: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
// Output:
// 1 2 3 5 8 9
// 10 13 15 20
// Explanation: After merging two sorted arrays we get 1 2 3 5 8 9 10 13 15 20.
// Input: a[] = [0, 1], b[] = [2, 3]
// Output:
// 0 1
// 2 3
// Explanation: After merging two sorted arrays we get 0 1 2 3.

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        // Two sorted arrays
        int[] arrayA = { 1, 5, 9, 10, 15, 20 }; // Larger array
        int[] arrayB = { 2, 3, 8, 13 }; // Smaller array

        // Start from the last element of arrayB
        for (int indexB = arrayB.length - 1; indexB >= 0; indexB--) {
            // If the last element of arrayA is greater than the current element in arrayB
            if (arrayA[arrayA.length - 1] > arrayB[indexB]) {
                int lastElementA = arrayA[arrayA.length - 1]; // Store the last element of arrayA
                int indexA = arrayA.length - 2; // Pointer to second last element of arrayA

                // Shift elements in arrayA to make room for arrayB[indexB]
                while (indexA >= 0 && arrayA[indexA] > arrayB[indexB]) {
                    arrayA[indexA + 1] = arrayA[indexA];
                    indexA--;
                }

                // Place the current element of arrayB in the correct position in arrayA
                arrayA[indexA + 1] = arrayB[indexB];

                // Move the last element of arrayA to arrayB
                arrayB[indexB] = lastElementA;
            }
        }

        // Print the merged arrays
        System.out.println("Array A: " + Arrays.toString(arrayA));
        System.out.println("Array B: " + Arrays.toString(arrayB));
    }
}
