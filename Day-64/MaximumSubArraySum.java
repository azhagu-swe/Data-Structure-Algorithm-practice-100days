
// Write a Java function to find the contiguous subarray within an array that has the largest sum.

// Here’s a Java program to find the maximum subarray sum using Kadane’s algorithm:
public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 }; // Example array of numbers
        int maxSoFar = nums[0];
        int currentMax = nums[0];

        for (int i = 0; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(currentMax, maxSoFar);

        }
        System.out.println(maxSoFar);
    }

}
