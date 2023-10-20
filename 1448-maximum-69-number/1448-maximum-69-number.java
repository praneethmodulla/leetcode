class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        boolean change = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '9'){
                sb.append(s.charAt(i));
            } else if(!change){
                change = true;
                sb.append('9');
            } else {
                sb.append(s.charAt(i));
            }
        }

        return Integer.parseInt(sb.toString());
    }
}