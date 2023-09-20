class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char [] str = s.toCharArray();
        char [] tstr = t.toCharArray();
        boolean ans = true;

        Arrays.sort(str);
        Arrays.sort(tstr);

        for(int i = 0; i < s.length(); i++){
            if(str[i] != tstr[i]){
                ans = false;
                break;
            }
        }
        return ans;
    }
}