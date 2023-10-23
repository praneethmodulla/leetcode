class Solution {
    public int numKLenSubstrNoRepeats(String s, int k) {
        if(k > s.length()){
            return 0;
        }

        int left = 0;
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
            while(right < s.length() && right - left < k){
                if(!set.contains(s.charAt(right))){
                    set.add(s.charAt(right));
                    right++;
                } else {
                    break;
                }
            }

            if(right - left == k){
                count += 1;
                set.remove(s.charAt(left));
                left++;
            }

            while(right < s.length() && set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            if(right < s.length()){
                set.add(s.charAt(right));
            }
        }

        if(set.size() == k){
            count += 1;
        }
        return count;
    }
}