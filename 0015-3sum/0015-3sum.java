class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= 0){
                if(i == 0 || nums[i - 1] != nums[i]){
                    int target = -1 * nums[i];
                    HashMap<Integer, Integer> mp = new HashMap<>();
                    for(int j = i + 1; j < nums.length; j++){
                        int comp = target - nums[j];
                        if(mp.containsKey(comp)){
                            List<Integer> result = new ArrayList<>();
                            result.add(nums[i]);
                            result.add(nums[j]);
                            result.add(comp);
                            res.add(result);
                            while(j + 1 < nums.length && nums[j + 1] == nums[j]){
                                j++;
                            }
                        } else {
                            mp.put(nums[j], j);
                        }
                    }
                }
            }
        }
        return res;
    }
}