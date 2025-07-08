public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int currentSum = nums[0], maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int extendSum = currentSum + nums[i];

            currentSum = extendSum < nums[i] ? nums[i] : extendSum;
            maxSum = maxSum < currentSum ? currentSum : maxSum;
        }
        System.out.println("Maximum Sub Array Sum : " + maxSum);

    }

}