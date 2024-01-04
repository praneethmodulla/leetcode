class Solution {
    public void setZeroes(int[][] matrix) {
        int[][] vis = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0 && vis[i][j] != 1){
                    vis[i][j] = 1;
                    setColZeroes(matrix, j, vis);
                    setRowZeroes(matrix, i, vis);
                }
            }
        }
    }

    public void setColZeroes(int[][] matrix, int col, int[][] vis){
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][col] != 0){
                vis[i][col] = 1;
                matrix[i][col] = 0;
            } else if(vis[i][col] != 1 && matrix[i][col] == 0){
                vis[i][col] = 1;
                setRowZeroes(matrix, i, vis);
            }
        }
    }

    public void setRowZeroes(int[][] matrix, int row, int[][] vis){
        for(int i = 0; i < matrix[row].length; i++){
            if(matrix[row][i] != 0){
                vis[row][i] = 1;
                matrix[row][i] = 0;
            } else if(vis[row][i] != 1 && matrix[row][i] == 0){
                vis[row][i] = 1;
                setColZeroes(matrix, i, vis);
            }
        }
    }
}