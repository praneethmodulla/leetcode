class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indx = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int cmp = target - nums[i];
            if(mp.containsKey(cmp)){
                indx[0] = mp.get(cmp);
                indx[1] = i;
            } else {
                mp.put(nums[i], i);
            }
        } 
        return indx;
    }
}