class Solution {
    public int numberOfBeams(String[] bank) {
        int cnt = 0;
        int prevVal = 0;
        int numBeams = 0;

        for(int i = 0; i < bank.length; i++){
            if(cnt > 0){
                prevVal = cnt;
            }
            cnt = 0;
            for(int j = 0; j < bank[i].length(); j++){
                if(bank[i].charAt(j) == '1'){
                    cnt++;
                }
            }

            if(cnt > 0 && prevVal > 0){
                numBeams += prevVal * cnt;  
            }
        }

        return numBeams;
    }
}