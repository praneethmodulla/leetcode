class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int profit = 0;
        int minPrice = prices[0];

        for(int i = 1; i < prices.length; i++){
            profit = prices[i] - minPrice;
            if(profit < 0){
                minPrice = prices[i];
            }

            if(profit > max){
                max = profit;
            }
        }

        return max > 0 ? max : 0;
    }
}