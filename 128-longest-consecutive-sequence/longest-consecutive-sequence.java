class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int count = 1;
        int maxCount = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                if(nums[i - 1] + 1 == nums[i]){
                    count++;
                } else {
                    count = 1;
                }
            }
            maxCount = Math.max(count, maxCount); 
        }

        return Math.max(count, maxCount);
    }
}