public class StockBuyAndSaleAlternative {
      // Function to calculate the maximum profit
      static int maximumProfit(int[] prices) {
        int n = prices.length;
        int lMin = prices[0];  // Local Minima
        int lMax = prices[0];  // Local Maxima
        int res = 0;

        int i = 0;
        while (i < n - 1) {
          
            // Find local minima
            while (i < n - 1 && prices[i] >= prices[i + 1]) { i++; }
            lMin = prices[i];
           
            // Local Maxima
            while (i < n - 1 && prices[i] <= prices[i + 1]) { i++; }
            lMax = prices[i];
          
            // Add current profit
            res += (lMax - lMin);
        }
      
        return res;
    }

    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(maximumProfit(prices));
    }
}
