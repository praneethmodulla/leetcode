class Solution {
    private static int N = 9;
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rowCheck = new HashSet[N];
        HashSet<Character>[] columnCheck = new HashSet[N];
        HashSet<Character>[] boxCheck = new HashSet[N];

        for(int i = 0; i < N; i++){
            rowCheck[i] = new HashSet<Character>();
            columnCheck[i] = new HashSet<Character>();
            boxCheck[i] = new HashSet<Character>();
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(board[i][j] != '.' && rowCheck[i].contains(board[i][j])){
                    return false;
                } else if(board[i][j] != '.'){
                    rowCheck[i].add(board[i][j]);
                }

                if(board[i][j] != '.' && columnCheck[j].contains(board[i][j])){
                    return false;
                } else if(board[i][j] != '.'){
                    columnCheck[j].add(board[i][j]);
                }

                int idx = (i/3) * 3 + (j/3);
                if(board[i][j] != '.' && boxCheck[idx].contains(board[i][j])){
                    return false;
                } else if(board[i][j] != '.'){
                    boxCheck[idx].add(board[i][j]);
                }

            }
        }


        return true;

    }
}