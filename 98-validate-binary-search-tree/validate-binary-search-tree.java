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
    
    public boolean isValidBST(TreeNode root) {
         return helper(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    
    public boolean helper(TreeNode root, long maxVal, long minVal){
        if(root == null){
            return true;
        }
        
        return (root.val < maxVal && root.val > minVal) && helper(root.left, root.val, minVal) && helper(root.right, maxVal, root.val); 
    }
}