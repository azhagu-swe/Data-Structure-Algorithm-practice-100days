// Input: prices[] = {100, 180, 260, 310, 40, 535, 695}
// Output: 865
// Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
//                        Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655
//                        Maximum Profit  = 210 + 655 = 865
public class StockBuyAndSale {

    public static void main(String[] args) {

        int[] prices = { 100, 180, 260, 310, 40, 535, 695 };
        int profit = maximumProfit(prices);
        System.out.println(profit);
    }

    private static int maximumProfit(int[] prices) {
        int total = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                total += (prices[i + 1] - prices[i]);
            }

        }
        return total;
    }
}
