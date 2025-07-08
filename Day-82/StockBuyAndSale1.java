public class StockBuyAndSale1 {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int buy =prices[0],maxProfit=0;

        for(int num:prices){
            if(num<buy){
                buy=num;
            }else if(num-buy>maxProfit){
                maxProfit=num-buy;
            }
        }
        System.out.println(maxProfit);
    }
    
}
