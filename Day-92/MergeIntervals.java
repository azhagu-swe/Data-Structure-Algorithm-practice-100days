import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Use a list to store merged intervals
        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            // If the list is empty or the current interval does not overlap with the previous one
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval); // Add the interval as is
            } else {
                // Merge the current interval with the previous one
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Convert the list to an array
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println("Merged: " + Arrays.deepToString(merge(intervals1))); // Expected: [[1, 6], [8, 10], [15, 18]]

        int[][] intervals2 = {{1, 4}, {4, 5}};
        System.out.println("Merged: " + Arrays.deepToString(merge(intervals2))); // Expected: [[1, 5]]
    }
}
