import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals1 = { { 1, 3 }, { 4, 5 }, { 6, 7 }, { 8, 10 } };
        int[] newInterval1 = { 5, 6 };
        System.out.println(formatOutput(insertInterval(intervals1, newInterval1)));

        int[][] intervals2 = { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } };
        int[] newInterval2 = { 4, 9 };
        System.out.println(formatOutput(insertInterval(intervals2, newInterval2)));
    }

    public static List<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // Step 1: Add all intervals that end before the new interval starts
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Step 2: Merge overlapping intervals with newInterval
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval); // Add the merged interval

        // Step 3: Add all intervals that start after the new interval ends
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result;
    }

    // Utility function to format output for better readability
    public static String formatOutput(List<int[]> intervals) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int[] interval : intervals) {
            sb.append("[").append(interval[0]).append(", ").append(interval[1]).append("], ");
        }
        if (!intervals.isEmpty()) sb.setLength(sb.length() - 2); // Remove trailing comma
        sb.append("]");
        return sb.toString();
    }
}