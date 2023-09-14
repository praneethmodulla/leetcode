class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int targetRow = -1;
        for(int i = 0; i < rows; i++){
            if(matrix[i][0] <= target){
                if(matrix[i][0] == target){
                    return true;
                }
                if(matrix[i][cols - 1] >= target){
                    if(matrix[i][cols - 1] == target){
                        return true;
                    } else {
                        targetRow = i;
                        break;
                    }
                }
            }
        }

        if(targetRow == -1){
            return false;
        } else {
            int left = 0;
            int right = cols - 1;

            int mid = left + (right - left)/2;

            while(left <= right){
                if(matrix[targetRow][mid] == target){
                    return true;
                } else if(matrix[targetRow][mid] > target){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                mid = left + (right - left)/2;
            } 
        }

        return false;
    }
}