class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] answer = new int[queries.length];
        int[] pSum = new int[nums.length];

        pSum[0] = nums[0];
        for(int k = 1; k < nums.length; k++){
            pSum[k] = nums[k] + pSum[k - 1];
        }

        for(int i = 0; i < queries.length; i++){
            int left = 0;
            int right = nums.length - 1;

            int mid = 0;

            while(left <= right){
                mid = left + (right - left)/2;

                if(pSum[mid] == queries[i]){
                    answer[i] = mid + 1;
                    break;
                } else if(pSum[mid] > queries[i]){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            if(answer[i] != mid + 1){
                answer[i] = right + 1;
            }
        }
        return answer;
    }
}