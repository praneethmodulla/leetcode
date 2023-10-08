class Solution {
    HashMap<Integer, Integer> mp = new HashMap<>();
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }

        if(!mp.containsKey(n)){
            mp.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        }

        return mp.get(n);
    }
}