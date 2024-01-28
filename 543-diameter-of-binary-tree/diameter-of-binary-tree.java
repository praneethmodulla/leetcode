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
        int[] diameter = new int[1];
        maxDiameter(root, diameter);
        return diameter[0];
    }

    public int maxDiameter(TreeNode node, int[] diameter){
        if(node == null){
            return 0;
        }

        int leftDepth = maxDiameter(node.left, diameter);
        int rightDepth = maxDiameter(node.right, diameter);

        diameter[0] = Math.max(diameter[0], leftDepth + rightDepth);

        return 1 + Math.max(leftDepth, rightDepth); 
    }
}