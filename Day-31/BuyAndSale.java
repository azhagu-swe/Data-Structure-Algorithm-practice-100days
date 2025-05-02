import java.util.Arrays;

public class BuyAndSale {
    /**
     * Finds the maximum profit from a single buy and sell transaction.
     * This optimized approach uses a single pass through the price array.
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param prices An array where prices[i] is the price of the stock on day i.
     * @return The maximum profit achievable from one transaction.
     */
    public static int maximumProfit(int prices[]) {
        // --- Step 1: Initialize ---
        // If there are less than 2 days, no transaction is possible.
        if (prices == null || prices.length < 2) {
            return 0;
        }

        // Initialize minPrice to the price on the first day.
        int minPrice = prices[0];
        // Initialize maxProfit to 0 (minimum possible profit).
        int maxProfit = 0;

        // --- Step 2: Iterate Through Prices ---
        // Start from the second day (index 1)
        for (int i = 1; i < prices.length; i++) {

            // --- Step 3: Calculate Potential Profit ---
            // Calculate profit if we bought at the lowest price seen so far (minPrice)
            // and sold on the current day (prices[i]).
            int potentialProfit = prices[i] - minPrice;

            // --- Step 4: Update Maximum Profit ---
            // If this potential profit is greater than the max profit found so far, update
            // maxProfit.
            // We use Math.max for a concise way to do this.
            maxProfit = Math.max(maxProfit, potentialProfit);

            // --- Step 5: Update Minimum Price ---
            // If the current day's price is lower than the minimum price seen so far,
            // update minPrice. This becomes the new best day to potentially buy.
            // We use Math.min for a concise way to do this.
            minPrice = Math.min(minPrice, prices[i]);

        } // --- Step 6: Repeat for all days ---

        // --- Step 7: Result ---
        // After iterating through all prices, maxProfit holds the answer.
        return maxProfit;
    }

    public static void main(String[] args) {
        // Example from the user's code
        int[] arr = { 7, 10, 1, 3, 6, 9, 2 };
        System.out.println("Input prices: " + Arrays.toString(arr));
        int maxReturn = maximumProfit(arr);
        System.out.println("Maximum profit (single transaction): " + maxReturn); // Expected: 8

        // Example from previous context
        int[] arr2 = { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println("\nInput prices: " + Arrays.toString(arr2));
        int maxReturn2 = maximumProfit(arr2);
        // Expected: 695 - 40 = 655 (Single best transaction)
        System.out.println("Maximum profit (single transaction): " + maxReturn2);

        // Example with decreasing prices
        int[] arr3 = { 7, 6, 4, 3, 1 };
        System.out.println("\nInput prices: " + Arrays.toString(arr3));
        int maxReturn3 = maximumProfit(arr3);
        System.out.println("Maximum profit (single transaction): " + maxReturn3); // Expected: 0
    }
}
