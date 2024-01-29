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
    public int maxPathSum(TreeNode root) {
        int[] mSum = new int[1];
        mSum[0] = Integer.MIN_VALUE;
        maxSum(root, mSum);
        return mSum[0];
    }

    public int maxSum(TreeNode node, int[] mSum){
        if(node == null){
            return 0;
        }

        int leftSum = Math.max(0, maxSum(node.left, mSum));
        int rightSum = Math.max(0, maxSum(node.right, mSum));

        mSum[0] = Math.max(mSum[0], leftSum + rightSum + node.val);

        return node.val + Math.max(leftSum, rightSum);
    }

}