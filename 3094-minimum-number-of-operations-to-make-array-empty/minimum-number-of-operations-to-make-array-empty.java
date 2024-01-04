class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        int minOps = -1;
        int numOps = 0;
        for(Integer i : mp.keySet()){
            if(mp.get(i)%3 == 0){
                numOps += mp.get(i)/3; 
            } else if(mp.get(i)%3 == 2){
                numOps += (mp.get(i)/3) + 1; 
            } else {
                if(mp.get(i)%6 == 1){
                    if(mp.get(i) == 1){
                        return minOps;
                    }
                    numOps += (mp.get(i)/6) * 2 + 1;
                } else if(mp.get(i)%6 == 4){
                    numOps += (mp.get(i)/6) * 2 + 2;
                }
            }
        }

        return numOps;
    }
}