public class StockBAndSellii {

      public static int maxProfit(int[] prices) {

        int buy=prices[0],maxProfit=0;
        for(int price:prices){
            if(buy>price){
                buy=price;
            }else if(price-buy>0){
                maxProfit +=price-buy;
                buy=price;
            }
        }
        return maxProfit;
        
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
        
    }
    
}
