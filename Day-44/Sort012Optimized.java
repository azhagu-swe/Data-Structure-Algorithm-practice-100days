import java.util.Arrays;

public class Sort012Optimized {

    /**
     * Sorts an array containing only 0s, 1s, and 2s in-place.
     * This method uses the Dutch National Flag algorithm.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param arr The input array, assumed to contain only 0s, 1s, and 2s.
     */
    public void sort012(int[] arr) {
        // Handle null or empty array as an edge case
        if (arr == null || arr.length == 0) {
            return;
        }

        // --- Step 1: Initialize Pointers ---
        int low = 0; // Points to the boundary of the 0s section
        int mid = 0; // Points to the current element being considered
        int high = arr.length - 1; // Points to the boundary of the 2s section
        int temp; // Temporary variable for swapping elements

        // --- Step 2: Iterate and Partition ---
        // Loop as long as the middle pointer is not past the high pointer
        while (mid <= high) {
            // Process the element at the 'mid' pointer
            switch (arr[mid]) {
                case 0: {
                    // If arr[mid] is 0:
                    // Swap arr[low] with arr[mid] to move the 0 to the 'low' section
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    // Increment both 'low' and 'mid' pointers
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    // If arr[mid] is 1:
                    // The element is already in its correct relative section (between 0s and 2s).
                    // Just move the 'mid' pointer to the next element.
                    mid++;
                    break;
                }
                case 2: {
                    // If arr[mid] is 2:
                    // Swap arr[mid] with arr[high] to move the 2 to the 'high' section
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    // Decrement the 'high' pointer
                    high--;
                    // IMPORTANT: Do NOT increment 'mid' here.
                    // The element swapped from arr[high] to arr[mid] is new
                    // and needs to be processed in the next iteration of the loop.
                    break;
                }
                default:
                    // This case should ideally not be reached if the input array
                    // strictly contains only 0s, 1s, and 2s as per the problem name.
                    // If other numbers are possible, this algorithm isn't directly applicable
                    // without modification, or an error should be thrown.
                    // For now, we can just move mid if this happens, assuming it's an anomaly
                    // or the problem constraints guarantee 0,1,2 only.
                    // System.err.println("Warning: Element " + arr[mid] + " is not 0, 1, or 2.");
                    mid++; // Or handle as an error
                    break;
            }
        }
        // --- Step 3: Result ---
        // The array is now sorted in-place.
    }

    // Main method for testing the sort012 function
    public static void main(String[] args) {
        Sort012Optimized sorter = new Sort012Optimized();

        int[] arr1 = { 0, 1, 2, 0, 1, 2 };
        System.out.println("Original array 1: " + Arrays.toString(arr1));
        sorter.sort012(arr1);
        System.out.println("Sorted array 1:   " + Arrays.toString(arr1)); // Expected: [0, 0, 1, 1, 2, 2]
        System.out.println("--------------------");

        int[] arr2 = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        System.out.println("Original array 2: " + Arrays.toString(arr2));
        sorter.sort012(arr2);
        System.out.println("Sorted array 2:   " + Arrays.toString(arr2)); // Expected: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2,
                                                                          // 2]
        System.out.println("--------------------");

        int[] arr3 = { 2, 1, 0 };
        System.out.println("Original array 3: " + Arrays.toString(arr3));
        sorter.sort012(arr3);
        System.out.println("Sorted array 3:   " + Arrays.toString(arr3)); // Expected: [0, 1, 2]
        System.out.println("--------------------");

        int[] arr4 = { 1, 1, 1, 1 };
        System.out.println("Original array 4: " + Arrays.toString(arr4));
        sorter.sort012(arr4);
        System.out.println("Sorted array 4:   " + Arrays.toString(arr4)); // Expected: [1, 1, 1, 1]
        System.out.println("--------------------");

        int[] arr5 = { 0, 0, 0 };
        System.out.println("Original array 5: " + Arrays.toString(arr5));
        sorter.sort012(arr5);
        System.out.println("Sorted array 5:   " + Arrays.toString(arr5)); // Expected: [0, 0, 0]
        System.out.println("--------------------");

        int[] arr6 = { 2, 2, 2, 0 };
        System.out.println("Original array 6: " + Arrays.toString(arr6));
        sorter.sort012(arr6);
        System.out.println("Sorted array 6:   " + Arrays.toString(arr6)); // Expected: [0, 2, 2, 2]
    }
}
