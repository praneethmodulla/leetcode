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
    public int sumSoFar = 0;
    public TreeNode bstToGst(TreeNode root) {
        
        helper(root);
        return root;
    }    

    public void helper(TreeNode node){
        if(node == null){
            return;
        }

        helper(node.right);
        sumSoFar += node.val;
        node.val = sumSoFar;
        helper(node.left);
    }
}