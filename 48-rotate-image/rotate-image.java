class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int up = 0;
        int left = 0;
        int right = n - 1;
        int down = n - 1;

        while(up < down && left < right){
            int cnt = 0;
            int temp = 0;
            for(int i = left; i < right; i++){
                temp = matrix[up][i];
                matrix[up][i] = matrix[down - cnt][i - cnt];
                matrix[down - cnt][i - cnt] = matrix[down][right - cnt];
                matrix[down][right - cnt] = matrix[up + cnt][right];
                matrix[up + cnt][right] = temp;
                cnt++;
            } 
            up++;
            down--;
            left++;
            right--;
        }
    }
}