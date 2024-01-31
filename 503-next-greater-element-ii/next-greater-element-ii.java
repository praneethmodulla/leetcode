class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            ans[i] = -1;
        }

        for(int i = 0; i < nums.length; i++){
            int currValue = nums[i];
            while(!stack.isEmpty() && nums[stack.peek()] < currValue){
                int prevIdx = stack.pop();
                ans[prevIdx] = currValue;
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            boolean flag = false;
            for(int i = 0; i < nums.length; i++){
                if(nums[stack.peek()] < nums[i]){
                    int idx = stack.pop();
                    ans[idx] = nums[i];
                    flag = true;
                    break;
                }
            }
            if(!flag){
                stack.pop();
            }
        }

        return ans;
    }
}