class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();

        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

        for(int i = 0 ; i < nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        for(Integer i : mp.keySet()){
            if(mp.get(i) > nums.length/3){
                res.add(i);
            }
        }
        return res;
    }
}