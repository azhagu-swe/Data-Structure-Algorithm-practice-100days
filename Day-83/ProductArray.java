import java.util.Arrays;

public class ProductArray {
    // Example 1:

    // Input: nums = [1,2,3,4]
    // Output: [24,12,8,6]
    // Example 2:

    // Input: nums = [-1,1,0,-3,3]
    // Output: [0,0,9,0,0]

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] ouput = productExceptSelf(a);
        System.out.println(Arrays.toString(ouput));

    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Compute prefix products
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix; // Store prefix product in result
            prefix *= nums[i]; // Update prefix product
        }

        // Step 2: Compute suffix products and multiply with prefix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix; // Multiply with suffix product
            suffix *= nums[i]; // Update suffix product
        }

        return result;
    }
}
