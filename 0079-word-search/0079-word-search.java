class Solution {
    private boolean wordExists = false;
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        int k = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(word.charAt(k) == board[i][j]){
                    dfs(board, word, k, i, j);
                }
            }
        }

        return wordExists;
    }

    public void dfs(char[][] board, String word, int idx, int r, int c){
        if(idx >= word.length()){
            wordExists = true;
            return;
        }

        if(r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] != word.charAt(idx)){
            return;
        }

        board[r][c] = '1';

        dfs(board, word, idx + 1, r + 1, c);
        dfs(board, word, idx + 1, r - 1, c);
        dfs(board, word, idx + 1, r, c + 1);
        dfs(board, word, idx + 1, r, c - 1);

        board[r][c] = word.charAt(idx);
    }
}