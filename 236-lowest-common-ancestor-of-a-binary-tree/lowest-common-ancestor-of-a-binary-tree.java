/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private TreeNode commonAncestor = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        helper(root, p, q);
        return commonAncestor;
    }

    public boolean helper(TreeNode node, TreeNode p, TreeNode q){
        if(node == null){
            return false;
        }

        boolean left = helper(node.left, p, q);
        boolean right = helper(node.right, p, q);

        if((left && right) || ((node == p || node == q) && left) || ((node == p || node == q) && right)){
            if(commonAncestor == null){
                commonAncestor = node;
            }
        }

        if(node == p || node == q){
            return true;
        }

        return left || right;
    }
}