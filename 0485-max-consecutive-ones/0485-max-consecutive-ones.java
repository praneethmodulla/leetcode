class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int left = 0;
        int right = 0;

        for(right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                left = right;
            } 

            while(left < nums.length && nums[left] == 0){
                left++;
            }

            if(maxOnes < right - left + 1){
                maxOnes = right - left + 1;
            }
        }

        return maxOnes;
    }
}