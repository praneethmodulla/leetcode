/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0){
            return null;
        } else if(nums.length == 1){
            return new TreeNode(nums[0]);
        }

        int max = Integer.MIN_VALUE;
        int max_idx = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                max_idx = i;
            }
        }

        int[] right = new int[nums.length - 1 - max_idx];
        int[] left = new int[max_idx];

        for(int i = 0; i < right.length; i++){
            right[i] = nums[i + max_idx + 1];
        }

        for(int i = 0; i < max_idx; i++){
            left[i] = nums[i];
        }

        TreeNode root = new TreeNode(max);
        root.right = constructMaximumBinaryTree(right);
        root.left = constructMaximumBinaryTree(left);
        return root;
    }
}