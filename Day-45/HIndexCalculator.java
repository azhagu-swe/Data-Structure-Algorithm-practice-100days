import java.util.Arrays;

public class HIndexCalculator {

    /**
     * Calculates the H-Index for a given array of citations.
     * H-index (H) is the largest value such that the researcher has published
     * at least H papers that have been cited at least H times.
     *
     * Time Complexity: O(N log N) due to sorting the citations array.
     * The subsequent loop runs in O(N).
     * Space Complexity: O(log N) or O(N) depending on the sorting algorithm used by Arrays.sort().
     * For primitive arrays, Arrays.sort() in Java uses a Dual-Pivot Quicksort,
     * which typically has O(log N) space complexity for the recursion stack.
     * If considering only auxiliary space beyond input modification, and if
     * a truly in-place sort like Heapsort was used, it could be O(1).
     * However, with Arrays.sort(), O(log N) is a safe assumption for primitives.
     *
     * @param citations An array where citations[i] is the number of citations for the ith paper.
     * @return The H-Index.
     */
    public static int hIndex(int[] citations) {
        // --- Step 4a: Handle edge case: empty or null array ---
        if (citations == null || citations.length == 0) {
            return 0;
        }

        int n = citations.length;

        // --- Step 4b: Sort the citations array in ascending order ---
        // This step takes O(N log N) time.
        Arrays.sort(citations); // Sorts in place

        // --- Step 4c: Loop with h from n down to 1 ---
        // This loop runs at most N times.
        // We are looking for the largest h such that there are h papers
        // with at least h citations.
        // In a sorted array (ascending), this means citations[n-h] >= h.
        for (int h = n; h >= 1; h--) {
            // --- Step 4d: Check the condition ---
            // The element at index (n-h) is the h-th element from the end
            // (0-indexed, so it's the (n-h)-th paper if we count from 0).
            // If this element's citation count is >= h, it means there are
            // at least 'h' papers (from index n-h to n-1, inclusive)
            // with at least 'h' citations because the array is sorted.
            if (citations[n - h] >= h) {
                // --- Step 4e: If condition is true, h is our H-index ---
                return h;
            }
        }

        // --- Step 4f: If loop finishes, H-index is 0 ---
        // This happens if no h from n down to 1 satisfied the condition
        // (e.g., all citations are 0).
        return 0;
    }

    public static void main(String[] args) {
        // Examples from the problem description
        int[] citations1 = {5, 0, 2, 0, 2};
        System.out.println("Citations: " + Arrays.toString(citations1)); // Sorted: [0, 0, 2, 2, 5]
        System.out.println("H-Index: " + hIndex(citations1)); // Expected: 2
        // h=5: c[0]=0 < 5
        // h=4: c[1]=0 < 4
        // h=3: c[2]=2 < 3
        // h=2: c[3]=2 >= 2. Return 2.
        System.out.println("----------");

        int[] citations2 = {6, 0, 3, 5, 3};
        System.out.println("Citations: " + Arrays.toString(citations2)); // Sorted: [0, 3, 3, 5, 6]
        System.out.println("H-Index: " + hIndex(citations2)); // Expected: 3
        // h=5: c[0]=0 < 5
        // h=4: c[1]=3 < 4
        // h=3: c[2]=3 >= 3. Return 3.
        System.out.println("----------");

        // Additional test cases
        int[] citations3 = {3, 0, 6, 1, 5};
        System.out.println("Citations: " + Arrays.toString(citations3)); // Sorted: [0, 1, 3, 5, 6]
        System.out.println("H-Index: " + hIndex(citations3)); // Expected: 3
        System.out.println("----------");

        int[] citations4 = {0, 0, 0};
        System.out.println("Citations: " + Arrays.toString(citations4));
        System.out.println("H-Index: " + hIndex(citations4)); // Expected: 0
        System.out.println("----------");

        int[] citations5 = {10};
        System.out.println("Citations: " + Arrays.toString(citations5)); // Sorted: [10]
        System.out.println("H-Index: " + hIndex(citations5)); // Expected: 1
        // h=1: c[0]=10 >= 1. Return 1.
        System.out.println("----------");

        int[] citations6 = {1, 1, 1, 1, 1};
        System.out.println("Citations: " + Arrays.toString(citations6)); // Sorted: [1, 1, 1, 1, 1]
        System.out.println("H-Index: " + hIndex(citations6)); // Expected: 1
        System.out.println("----------");
        
        int[] citations7 = {100, 200, 300};
        System.out.println("Citations: " + Arrays.toString(citations7)); // Sorted: [100, 200, 300]
        System.out.println("H-Index: " + hIndex(citations7)); // Expected: 3
        System.out.println("----------");
    }
}
