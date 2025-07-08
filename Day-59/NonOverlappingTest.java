import java.util.Arrays;

public class NonOverlappingTest {
    public static void main(String[] args) {
        int[][] intervals1 = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 } };
        int[][] intervals2 = { { 1, 3 }, { 1, 3 }, { 1, 3 } };
        int[][] intervals3 = { { 1, 2 }, { 5, 10 }, { 18, 35 }, { 40, 45 } };

        System.out.println(minIntervalsToRemove(intervals1)); // Output: 1
        System.out.println(minIntervalsToRemove(intervals2)); // Output: 2
        System.out.println(minIntervalsToRemove(intervals3)); // Output: 0
    }

    private static int minIntervalsToRemove(int[][] intervals1) {
        // Step 1: sort intervals by end time
        Arrays.sort(intervals1, (a, b) -> a[1] - b[1]);

        // bubble sort

        for (int i=0;i<intervals1.length;i++) {


        }

        int removals = 0;
        int previousEnd = Integer.MIN_VALUE;
        // step 2 : iterate through intervals
        for (int[] interval : intervals1) {

            if (interval[0] < previousEnd) {
                removals++;

            } else {
                previousEnd = interval[1];
            }

        }
        return removals;

    }

}
