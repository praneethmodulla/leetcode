class Solution {
    HashMap<Integer, Integer> mp = new HashMap<>();
    public int minCostClimbingStairs(int[] cost) {
        return minCost(cost.length, cost);
    }

    public int minCost(int len, int[] cost){
        if(len <= 1){
            return 0;
        }

        if(mp.containsKey(len)){
            return mp.get(len);
        }

        int costOne = cost[len - 1] + minCost(len - 1, cost);
        int costTwo = cost[len - 2] + minCost(len - 2, cost);

        mp.put(len, Math.min(costOne, costTwo));

        return mp.get(len);
    }
}