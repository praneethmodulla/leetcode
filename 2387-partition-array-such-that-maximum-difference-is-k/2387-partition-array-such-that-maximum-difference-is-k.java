class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);

        int numSequences = 0;
        boolean countLast = false;
        int left = 0;

        for(int right = 0; right < nums.length; right++){
            while(right < nums.length && nums[right] - nums[left] <= k){
                right++;
            }
            if(right == nums.length - 1){
                countLast = true;
            }
            left = right;
            numSequences += 1;
        }

        return countLast ? numSequences + 1 : numSequences;
    }
}