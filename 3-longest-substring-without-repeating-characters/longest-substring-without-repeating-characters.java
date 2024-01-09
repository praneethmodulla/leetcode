class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLen = 0;

        HashSet<Character> set = new HashSet<>();

        for(right = 0; right < s.length(); right++){

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
            }

            if(maxLen < right - left + 1){
                maxLen = right - left + 1;
            }
        }

        return maxLen;
    }
}