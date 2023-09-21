class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for(int i = 0; i < ans.length; i++){
            int count = numOnes(i);
            ans[i] = count;
        }

        return ans;
    }

    public int numOnes(int num){
        int c = 0;
        while(num != 0){
            c++;
            num &= (num - 1);
        }
        return c;
    }
}