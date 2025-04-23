// Write a program to sort the elements in odd positions in descending order and elements in ascending order

// Eg 1: Input: 13,2 4,15,12,10,5
//         Output: 13,2,12,10,5,15,4
// Eg 2: Input: 1,2,3,4,5,6,7,8,9
//         Output: 9,2,7,4,5,6,3,8,1 

import java.util.Arrays;

public class OddEvenDistance2Sorter {

    public static void main(String[] args) {
        int[] arr1 = { 13, 2, 4, 15, 12, 10, 5 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println("Before: " + Arrays.toString(arr1));
        oddEvenDistance2Sort(arr1);
        System.out.println(" After: " + Arrays.toString(arr1));

        System.out.println("Before: " + Arrays.toString(arr2));
        oddEvenDistance2Sort(arr2);
        System.out.println(" After: " + Arrays.toString(arr2));
    }

    /**
     * Repeatedly performs two phases until no swaps occur:
     * Phase A (i = 1,3,5...): sort 0-based odd indices ascending by comparing a[i]
     * vs a[i+2].
     * Phase B (i = 0,2,4...): sort 0-based even indices descending by comparing
     * a[i] vs a[i+2].
     */
    public static void oddEvenDistance2Sort(int[] a) {
        int n = a.length;
        boolean swapped;
        do {
            swapped = false;

            // Phase A: fix 1-based even positions (0-based odd indices) in ascending order
            for (int i = 1; i + 2 < n; i += 2) {
                if (a[i] > a[i + 2]) {
                    // swap a[i] and a[i+2]
                    int tmp = a[i];
                    a[i] = a[i + 2];
                    a[i + 2] = tmp;
                    swapped = true;
                }
            }

            // Phase B: fix 1-based odd positions (0-based even indices) in descending order
            for (int i = 0; i + 2 < n; i += 2) {
                if (a[i] < a[i + 2]) {
                    // swap a[i] and a[i+2]
                    int tmp = a[i];
                    a[i] = a[i + 2];
                    a[i + 2] = tmp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
