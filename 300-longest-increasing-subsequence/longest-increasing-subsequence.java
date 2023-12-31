class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int[] dp = new int[nums.length];

        for(int i = 0; i < dp.length; i++){
            dp[i] = 1;
        } 

        int maxVal = Integer.MIN_VALUE;

        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            if(maxVal < dp[i]){
                maxVal = dp[i];
            }
        }

        return maxVal;
    }
}