class Solution {
    private static int area = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = Integer.MIN_VALUE;
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                area = 0;
                if(grid[i][j] == 1){
                    dfs(grid, i, j);
                }

                if(area > maxArea){
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    public void dfs(int[][] grid, int r, int c){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0){
            return;
        }
        area += 1;
        grid[r][c] = 0;
        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);

    }
}