import java.util.Arrays; // Still needed for Arrays.toString in main

public class MinimizeHeightsNoInbuilt {

    /**
     * Minimizes the difference between the maximum and minimum tower heights
     * after increasing or decreasing each height by k (once). Heights cannot be negative.
     * This version avoids using Arrays.sort(), Math.min(), and Math.max().
     *
     * @param arr The array of tower heights.
     * @param k   The value to add or subtract.
     * @return The minimum possible difference between max and min heights.
     */
    static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        // Handle edge case: If only one tower, difference is 0
        if (n <= 1) {
            return 0;
        }

        // --- Step 1: Sort the array (Manual Implementation - Bubble Sort) ---
        // NOTE: Bubble Sort is O(N^2), less efficient than Arrays.sort() (O(N log N)).
        // This is done here to avoid the built-in function as requested.
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Now 'arr' is sorted in ascending order.

        // --- Step 2: Initialize result ---
        // Initial difference is the difference between the tallest and shortest *original* towers.
        // This also covers the case where all towers are increased by k or all decreased by k.
        int res = arr[n - 1] - arr[0];

        // Potential minimum and maximum after modification across the whole array
        int potentialMinOverall = arr[0] + k;
        int potentialMaxOverall = arr[n - 1] - k;
        if (potentialMaxOverall < potentialMinOverall) { // Swap if needed after modification
            int temp = potentialMinOverall;
            potentialMinOverall = potentialMaxOverall;
            potentialMaxOverall = temp;
        }
         // Consider the initial difference after modifying all elements
         // This handles cases where k is very large.
         // res = (res < (potentialMaxOverall - potentialMinOverall)) ? res : (potentialMaxOverall - potentialMinOverall);
         // The loop below implicitly covers this comparison by checking arr[0]+k and arr[n-1]-k


        // --- Step 3: Iterate through potential "split points" ---
        // Consider each adjacent pair as a point where we switch from adding k to subtracting k.
        for (int i = 1; i < n; i++) { // Start from 1 because we access arr[i-1]

            // --- Step 3a: Check if decreasing arr[i] is possible ---
            int decreasedCurrent = arr[i] - k;
            if (decreasedCurrent < 0) {
                // If decreasing makes the height negative, this split point isn't valid
                // because all subsequent towers (which are >= arr[i]) would also be negative
                // when decreased by k. However, the original difference might still be the minimum.
                // We can continue checking other split points before this one.
                 continue;
            }

            // --- Step 3b: Calculate potential new min and max after modification ---
            // Potential minimum height:
            // Compare the smallest tower increased (arr[0]+k) vs the current tower decreased (decreasedCurrent)
            int increasedFirst = arr[0] + k;
            int minH = (increasedFirst < decreasedCurrent) ? increasedFirst : decreasedCurrent; // Manual Math.min

            // Potential maximum height:
            // Compare the tower just before 'i' increased (arr[i-1]+k) vs the largest tower decreased (arr[n-1]-k)
            int increasedPrev = arr[i - 1] + k;
            int decreasedLast = arr[n - 1] - k;
             // Ensure decreasedLast isn't negative implicitly (though the outer check helps)
             // The check 'if (arr[i] - k < 0)' handles cases where decreasing *any* tower from i onwards is impossible.
             // If decreasedLast itself is negative, it likely won't be the max unless increasedPrev is also negative (which is impossible).
            int maxH = (increasedPrev > decreasedLast) ? increasedPrev : decreasedLast; // Manual Math.max

            // --- Step 3c: Update the minimum difference found so far ---
            int currentDiff = maxH - minH;
            res = (res < currentDiff) ? res : currentDiff; // Manual Math.min
        }

        // --- Step 4: Return the overall minimum difference ---
        return res;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 8, 10};
        int k1 = 2;
        System.out.println("Input: arr=" + Arrays.toString(arr1) + ", k=" + k1);
        System.out.println("Min Diff: " + getMinDiff(arr1, k1)); // Expected: 5 (arr becomes ~{3, 7, 6, 8} -> min=3, max=8)

        int[] arr2 = {3, 9, 12, 16, 20};
        int k2 = 3;
        System.out.println("\nInput: arr=" + Arrays.toString(arr2) + ", k=" + k2);
        System.out.println("Min Diff: " + getMinDiff(arr2, k2)); // Expected: 11 (arr becomes ~{6, 12, 9, 13, 17} -> min=6, max=17)

        int[] arr3 = {6, 10};
        int k3 = 3;
        System.out.println("\nInput: arr=" + Arrays.toString(arr3) + ", k=" + k3);
        System.out.println("Min Diff: " + getMinDiff(arr3, k3)); // Expected: 2 (arr becomes {9, 7} -> min=7, max=9)

         int[] arr4 = {1, 10, 14, 14, 14, 15};
         int k4 = 6;
         System.out.println("\nInput: arr=" + Arrays.toString(arr4) + ", k=" + k4);
         System.out.println("Min Diff: " + getMinDiff(arr4, k4)); // Expected: 5 (arr becomes {7, 4, 8, 8, 8, 9} -> min=4, max=9)

         int[] arr5 = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
         int k5 = 5;
         System.out.println("\nInput: arr=" + Arrays.toString(arr5) + ", k=" + k5);
         // Sorted: {1, 2, 2, 2, 3, 3, 4, 6, 7, 10}
         System.out.println("Min Diff: " + getMinDiff(arr5, k5)); // Expected: 7 (arr becomes ~{6, 7, 7, 7, 8, 8, 9, 1, 2, 5} -> min=1, max=9 -> diff=8? let's recheck logic.
         // Maybe split after 7: {6, 7, 7, 7, 8, 8, 9, 11, 2, 5} -> min=2, max=11 -> diff=9
         // Maybe split after 6: {6, 7, 7, 7, 8, 8, 9, 1, 2, 5} -> min=1, max=9 -> diff=8
         // Maybe split after 4: {6, 7, 7, 7, 8, -2... impossible
         // Maybe split after 3 (idx 4): {6, 7, 7, 7, 8, -2... impossible
         // Maybe split after 3 (idx 5): {6, 7, 7, 7, 8, 8, -1... impossible
         // Maybe split after 2 (idx 3): {6, 7, 7, 7, -2... impossible
         // Maybe split after 2 (idx 2): {6, 7, 7, -3... impossible
         // Maybe split after 1 (idx 0): {6, -3... impossible
         // Original diff: 10-1=9. All +k: {6..15}, diff=9. All -k: {-4..5}, diff=9.
         // Let's trace arr1: {1, 5, 8, 10}, k=2. Sorted. res=9.
         // i=1: arr[1]-k=3>=0. minH=min(1+2, 5-2)=min(3,3)=3. maxH=max(1+2, 10-2)=max(3,8)=8. res=min(9, 8-3)=5.
         // i=2: arr[2]-k=6>=0. minH=min(1+2, 8-2)=min(3,6)=3. maxH=max(5+2, 10-2)=max(7,8)=8. res=min(5, 8-3)=5.
         // i=3: arr[3]-k=8>=0. minH=min(1+2, 10-2)=min(3,8)=3. maxH=max(8+2, 10-2)=max(10,8)=10. res=min(5, 10-3)=5. Final=5. Correct.
         // Let's trace arr5: {1, 2, 2, 2, 3, 3, 4, 6, 7, 10}, k=5. Sorted. res=9.
         // i=1: arr[1]-k = 2-5 = -3. continue.
         // i=2: arr[2]-k = 2-5 = -3. continue.
         // i=3: arr[3]-k = 2-5 = -3. continue.
         // i=4: arr[4]-k = 3-5 = -2. continue.
         // i=5: arr[5]-k = 3-5 = -2. continue.
         // i=6: arr[6]-k = 4-5 = -1. continue.
         // i=7: arr[7]-k = 6-5 = 1 >=0. minH=min(1+5, 6-5)=min(6,1)=1. maxH=max(4+5, 10-5)=max(9,5)=9. res=min(9, 9-1)=8.
         // i=8: arr[8]-k = 7-5 = 2 >=0. minH=min(1+5, 7-5)=min(6,2)=2. maxH=max(6+5, 10-5)=max(11,5)=11. res=min(8, 11-2)=8.
         // i=9: arr[9]-k = 10-5 = 5 >=0. minH=min(1+5, 10-5)=min(6,5)=5. maxH=max(7+5, 10-5)=max(12,5)=12. res=min(8, 12-5)=7. Final=7. Correct.

    }
}

