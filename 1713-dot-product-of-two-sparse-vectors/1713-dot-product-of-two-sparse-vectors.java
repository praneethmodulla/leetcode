class SparseVector {
    
    HashMap<Integer, Integer> map;

    SparseVector(int[] nums) {
        map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                map.put(i, nums[i]);
            }
        }
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        boolean thisMapSize = (this.map.size() >= vec.map.size());
        int prod = 0;
        if(thisMapSize){
            for(int i : this.map.keySet()){
                if(vec.map.containsKey(i)){
                    prod += vec.map.get(i) * this.map.get(i);
                }
            }
        } else {
            for(int i : vec.map.keySet()){
                if(this.map.containsKey(i)){
                    prod += vec.map.get(i) * this.map.get(i);
                }
            }
        }

        return prod;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);