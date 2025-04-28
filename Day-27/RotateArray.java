import java.util.Arrays;

public class RotateArray {


    /**
     * Helper function to reverse a portion of the array.
     * Reverses the elements in arr from index start to index end (inclusive).
     *
     * @param arr   The array to modify.
     * @param start The starting index of the subarray to reverse.
     * @param end   The ending index of the subarray to reverse.
     */
    private static void reverse(int arr[], int start, int end) {
        // Continue swapping until the start index meets or passes the end index
        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Move indices towards the center
            start++;
            end--;
        }
    }

    /**
     * Rotates the array `arr` to the left by `d` positions using the Reversal Algorithm.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param arr The array to rotate.
     * @param d   The number of positions to rotate left.
     */
    static void rotateArr(int arr[], int d) {
        int n = arr.length;

        // Handle cases where d is 0 or a multiple of n (no rotation needed)
        if (d == 0 || d % n == 0) {
            return;
        }

        // Ensure d is within the bounds of the array length [0, n-1]
        // If d is greater than n, the effective rotation is d % n
        d = d % n;

        // Step 1: Reverse the first d elements (arr[0...d-1])
        reverse(arr, 0, d - 1);

        // Step 2: Reverse the remaining n-d elements (arr[d...n-1])
        reverse(arr, d, n - 1);

        // Step 3: Reverse the entire array (arr[0...n-1])
        reverse(arr, 0, n - 1);
    }

    // Example Usage (Optional - for testing)
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int d1 = 2;
        System.out.println("Original array: " + Arrays.toString(arr1));
        rotateArr(arr1, d1);
        System.out.println("Rotated array by " + d1 + ": " + Arrays.toString(arr1)); // Expected: [3, 4, 5, 6, 7, 1, 2]

        System.out.println("---");

        int[] arr2 = {1, 2, 3, 4, 5};
        int d2 = 7; // d > n
        System.out.println("Original array: " + Arrays.toString(arr2));
        rotateArr(arr2, d2); // Effective rotation is 7 % 5 = 2
        System.out.println("Rotated array by " + d2 + ": " + Arrays.toString(arr2)); // Expected: [3, 4, 5, 1, 2]

        System.out.println("---");

         int[] arr3 = {10, 20, 30, 40};
        int d3 = 0; // d = 0
        System.out.println("Original array: " + Arrays.toString(arr3));
        rotateArr(arr3, d3);
        System.out.println("Rotated array by " + d3 + ": " + Arrays.toString(arr3)); // Expected: [10, 20, 30, 40]
    }
}
