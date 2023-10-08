class Solution {
    public HashMap<Integer, Integer> mp = new HashMap<>();
    public int fib(int n) {
        if(mp.containsKey(n)){
            return mp.get(n);
        }

        int res;
        if(n < 2){
            res = n;
        } else {
            res = fib(n - 1) + fib(n - 2);
        }

        mp.put(n, res);
        return res;
    }
}