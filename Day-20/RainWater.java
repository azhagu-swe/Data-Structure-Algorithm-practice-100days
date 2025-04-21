class RainWater {
    /**
     * Computes how much rainwater can be trapped between bars of an elevation map.
     *
     * Analogy: Calculating the total water trapped in puddles on a LEGO wall.
     * Uses the Two Pointers approach.
     *
     * @param height An array of non-negative integers representing the elevation map.
     * @return The total amount of trapped rainwater.
     */
    public int trap(int[] height) {
        // Need at least 3 bars to potentially trap water (left wall, dip, right wall).
        if (height == null || height.length < 3) {
            return 0; // Not enough bars to form a puddle.
        }

        int n = height.length;
        int left = 0;          // Left pointer (finger starting at the left end of the LEGO wall).
        int right = n - 1;     // Right pointer (finger starting at the right end).
        int leftMax = 0;       // Tallest wall seen by the left finger so far.
        int rightMax = 0;      // Tallest wall seen by the right finger so far.
        int totalWater = 0;    // Total trapped water accumulated.

        // Move the pointers towards each other until they meet.
        while (left < right) {
            // Compare the heights at the current left and right pointers.
            if (height[left] < height[right]) {
                // --- Process the left side ---
                // The water level at 'left' is potentially limited by 'leftMax',
                // because we know 'height[right]' (or something else to the right) is taller.

                // Update leftMax if the current bar is taller.
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // Found a new highest wall on the left side. No water trapped here.
                } else {
                    // If the current bar is shorter than leftMax, it can trap water.
                    // The amount of water is determined by the difference.
                    // Water level = leftMax, Bar height = height[left]
                    totalWater += leftMax - height[left]; // Add trapped water above this bar.
                }
                // Move the left pointer one step to the right.
                left++;

            } else {
                // --- Process the right side ---
                // The water level at 'right' is potentially limited by 'rightMax',
                // because we know 'height[left]' (or something else to the left) is taller or equal.

                // Update rightMax if the current bar is taller.
                if (height[right] >= rightMax) {
                    rightMax = height[right]; // Found a new highest wall on the right side. No water trapped here.
                } else {
                    // If the current bar is shorter than rightMax, it can trap water.
                    // Water level = rightMax, Bar height = height[right]
                    totalWater += rightMax - height[right]; // Add trapped water above this bar.
                }
                // Move the right pointer one step to the left.
                right--;
            }
        }

        // Once the pointers meet, we have processed the whole wall.
        return totalWater;
    }

     // Example Usage (optional, for testing)
    public static void main(String[] args) {
        RainWater rainWater=new RainWater();
        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Example 1 Output: " + rainWater.trap(height1)); // Expected: 6

        int[] height2 = {4,2,0,3,2,5};
        System.out.println("Example 2 Output: " + rainWater.trap(height2)); // Expected: 9

        int[] height3 = {4,2,3};
        System.out.println("Example 3 Output: " + rainWater.trap(height3)); // Expected: 1
    }
}
