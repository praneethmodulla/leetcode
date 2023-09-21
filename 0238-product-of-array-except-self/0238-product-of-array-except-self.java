class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProd = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                leftProd[i] = 1;
            } else {
                leftProd[i] = leftProd[i - 1] * nums[i - 1]; 
            }
        }

        int R = 1;

        for(int j = nums.length - 1; j >= 0; j--){
            leftProd[j] *= R;
            R *= nums[j];
        }

        return leftProd;
    }
}