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
        if(root == null){
            return true;
        }

        int leftDepth = calcDepth(root.left);
        int rightDepth = calcDepth(root.right);
        return Math.abs(leftDepth - rightDepth) <= 1 && isBalanced(root.left) && isBalanced(root.right); 
    }

    public int calcDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = calcDepth(root.left) + 1;
        int right = calcDepth(root.right) + 1;

        return left > right ? left : right;
    }

}