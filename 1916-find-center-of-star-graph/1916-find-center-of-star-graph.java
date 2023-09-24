class Solution {
    public int findCenter(int[][] edges) {
        if(edges.length == 0 || edges == null){
            return 0;
        }

        int[] count = new int[edges.length + 2];
        Arrays.fill(count, 0);

        for(int i = 0; i < edges.length; i++){
            for(int j = 0; j < 2; j++){
                count[edges[i][j]] += 1;
            }
        }

        int centerNode = 0;

        for(int k = 0; k < count.length; k++){
            if(count[k] == edges.length){
                centerNode = k;
                break;
            }
        }

        return centerNode;
    }
}