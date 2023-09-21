class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int area = 0;
        int i = 0;
        int j = height.length - 1;

        while(i < j){
            int minHeight = Math.min(height[i], height[j]);
            area = (j - i) * (minHeight);
            if(area > maxArea){
                maxArea = area;
            }

            if(height[i] <= height[j]){
                i++;
            } else {
                j--;
            }
        }

        return maxArea;
    }
}