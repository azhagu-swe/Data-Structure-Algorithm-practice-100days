public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate the area
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max Area: " + maxArea(height1)); // Expected: 49

        // Test Case 2
        int[] height2 = {1, 1};
        System.out.println("Max Area: " + maxArea(height2)); // Expected: 1

        // Test Case 3
        int[] height3 = {4, 3, 2, 1, 4};
        System.out.println("Max Area: " + maxArea(height3)); // Expected: 16

        // Test Case 4
        int[] height4 = {1, 2, 1};
        System.out.println("Max Area: " + maxArea(height4)); // Expected: 2
    }
}
