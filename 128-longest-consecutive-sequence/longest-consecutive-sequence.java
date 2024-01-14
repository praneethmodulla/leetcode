class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int longestStreak = 0;
        int currentStreak = 0;

        for(Integer i : set){
            
            if(!set.contains(i - 1)){
                int currentNum = i;
                currentStreak = 1;
                while(set.contains(currentNum + 1)){
                    currentStreak += 1;
                    currentNum += 1;
                }

                longestStreak = Math.max(currentStreak, longestStreak);
            }
        }

        return longestStreak;
    }
}