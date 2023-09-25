class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        HashMap<Integer, Integer> check = new HashMap<>();

        for(int i = 1; i <= n; i++){
            check.put(i, 1);
        }

        for(int i = 0; i < n; i++){
            HashMap<Integer, Integer> row = new HashMap<>();
            HashMap<Integer, Integer> col = new HashMap<>();
            for(int j = 0; j < n; j++){
                row.put(matrix[i][j], row.getOrDefault(matrix[i][j], 0) + 1);
                col.put(matrix[j][i], col.getOrDefault(matrix[j][i], 0) + 1);
            }

            for(int key : check.keySet()){
                if(row.get(key) == null || row.get(key) > 1){
                    return false;
                }

                if(col.get(key) == null || col.get(key) > 1){
                    return false;
                }
            }
        }
        return true;
    }
}