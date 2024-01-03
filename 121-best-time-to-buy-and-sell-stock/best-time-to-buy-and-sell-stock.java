class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profit = 0;
        int minPrice = prices[0];

        for(int i = 1; i < prices.length; i++){
            profit = prices[i] - minPrice;
            if(maxProfit < profit){
                maxProfit = profit;
            }
            if(profit < 0){
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}