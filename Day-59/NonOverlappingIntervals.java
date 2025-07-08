import java.util.Arrays;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals1 = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int[][] intervals2 = {{1, 3}, {1, 3}, {1, 3}};
        int[][] intervals3 = {{1, 2}, {5, 10}, {18, 35}, {40, 45}};
        
        System.out.println(minIntervalsToRemove(intervals1)); // Output: 1
        System.out.println(minIntervalsToRemove(intervals2)); // Output: 2
        System.out.println(minIntervalsToRemove(intervals3)); // Output: 0
    }

    /**
     * Returns the minimum number of intervals to remove to make the intervals non-overlapping.
     * 
     * @param intervals A 2D array representing the intervals.
     * @return Minimum number of intervals to remove.
     */
    public static int minIntervalsToRemove(int[][] intervals) {
        // Step 1: Sort intervals by their end times
        Arrays.sort(intervals, (a, b) -> a[1]- b[1]);

        int removals = 0;
        int previousEnd = Integer.MIN_VALUE;

        // Step 2: Iterate through the intervals
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            // Step 3: Check for overlap
            if (start < previousEnd) {
                // Overlap found, increment removals
                removals++;
            } else {
                // No overlap, update the previous end
                previousEnd = end;
            }
        }

        return removals;
    }
}
