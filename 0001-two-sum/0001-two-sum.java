class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<>();
        int comp = 0;
        for(int i = 0; i < nums.length; i++){
            comp = target - nums[i];
            if(mp.containsKey(comp)){
                index[0] = i;
                index[1] = mp.get(comp);
                return index;
            } else {
                mp.put(nums[i], i);
            }
        }
        return null;
    }
}