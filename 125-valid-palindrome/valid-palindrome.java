class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) <= 'z' && s.charAt(i) >= 'a') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                sb.append(s.charAt(i));
            }
        }
        String str = sb.toString().toLowerCase();

        int n = str.length();
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n - 1 - i)){
                return false;
            }
        }

        return true;

    }
}