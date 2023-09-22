class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            } else if(maxProfit < prices[i] - minPrice){
                maxProfit = prices[i] - minPrice;
            }
        }
        if(maxProfit == Integer.MIN_VALUE){
            return 0;
        }
        return maxProfit;
    }
}