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
    TreeNode result = null;
    public TreeNode searchBST(TreeNode root, int val) {
        helper(root, val);
        return result;
    }

    public void helper(TreeNode node, int val){
        if(node == null){
            return;
        }

        if(node.val == val){
            result = node;
        } else {
            helper(node.left, val);
            helper(node.right, val);
        }
    }
}