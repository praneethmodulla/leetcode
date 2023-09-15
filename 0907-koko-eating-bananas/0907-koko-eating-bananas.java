class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int i : piles){
            right = Math.max(right, i);
        }
        int mid = 0;
        while(left <= right){
            mid = left + (right - left)/2;

            if(check(mid, piles, h)){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public boolean check(int checkVal, int[] piles, int hours){
        int numHours = 0;
        for(double i : piles){
            numHours += Math.ceil(i/checkVal);
        }
        return numHours <= hours;
    }
}