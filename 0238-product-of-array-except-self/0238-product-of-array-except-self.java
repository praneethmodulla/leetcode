class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProd = new int[nums.length];
        int[] rightProd = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                leftProd[i] = 1;
            } else {
                leftProd[i] = leftProd[i - 1] * nums[i - 1]; 
            }
        }

        for(int j = nums.length - 1; j >= 0; j--){
            if(j == nums.length - 1){
                rightProd[j] = 1;
            } else {
                rightProd[j] = rightProd[j + 1] * nums[j + 1];
            }
        }

        for(int k = 0; k < nums.length; k++){
            leftProd[k] *= rightProd[k];
        }

        return leftProd;
    }
}