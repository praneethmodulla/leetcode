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
    public boolean isBalanced(TreeNode root) {
        return calcDepth(root) != -1;
    }

    public int calcDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftDepth = calcDepth(root.left);
        if(leftDepth == -1){
            return -1;
        }
        int rightDepth = calcDepth(root.right);
        if(rightDepth == -1){
            return - 1;
        }

        if(Math.abs(leftDepth - rightDepth) > 1){
            return -1;
        }

        return Math.max(leftDepth, rightDepth) + 1;
    }

}