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
    public int diameterOfBinaryTree(TreeNode root) {
        return maxDiameter(root);
    }

    public int maxDiameter(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);
        int diameter = leftDepth + rightDepth;

        return Math.max(diameter, Math.max(maxDiameter(node.left), maxDiameter(node.right)));
    }

    public int depth(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);

        return Math.max(leftDepth, rightDepth) + 1; 
    }
}