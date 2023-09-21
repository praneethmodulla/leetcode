class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int dupNum = 0;
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                dupNum = nums[i];
                break;
            }
            set.add(nums[i]);
        }
        return dupNum;
    }
}