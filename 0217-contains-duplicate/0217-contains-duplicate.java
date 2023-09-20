class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean ans = false;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                ans = true;
                break;
            } else {
                set.add(i);
            }
        }

        return ans;
    }
}