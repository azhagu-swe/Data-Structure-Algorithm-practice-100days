import java.util.ArrayList;
import java.util.List;

public class MiniPeaks {
    public static void main(String[] args) {
        // Test case: array with one mini peak (the value 4)
        int[] numbers = { 1, 2, 3, 4, -5, -6, -4, 0 };

        // Using an ArrayList to store mini peaks dynamically
        List<Integer> miniPeaks = new ArrayList<>();

        // Check for mini peaks: an element is a mini peak if both neighbors are lower.
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i - 1] < numbers[i] && numbers[i + 1] < numbers[i]) {
                miniPeaks.add(numbers[i]);
            }
        }

        // Print the found mini peaks
        System.out.println("Mini Peaks Numbers: " + miniPeaks);
    }
}
