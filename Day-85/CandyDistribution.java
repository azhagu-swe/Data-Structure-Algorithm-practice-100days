import java.util.*;

public class CandyDistribution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1); // Step 1: Initialize candies array with 1 candy each

        // Step 2: Left-to-Right pass
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: Right-to-Left pass
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Step 4: Sum up all candies
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }

    public static void main(String[] args) {
        CandyDistribution solution = new CandyDistribution();

        // Example 1
        int[] ratings1 = {1, 0, 2};
        System.out.println("Output: " + solution.candy(ratings1)); // Expected: 5

        // Example 2
        int[] ratings2 = {1, 2, 2};
        System.out.println("Output: " + solution.candy(ratings2)); // Expected: 4
    }
}
