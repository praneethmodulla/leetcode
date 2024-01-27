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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> array = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null){
            return array;
        } 

        stack.push(root);
        TreeNode node = root;
        while(node != null || !stack.isEmpty()){
            while(node != null){
                stack.push(node.left);
                node = node.left;
            }
            node = stack.pop();
            if(node != null){
                array.add(node.val);
            }
            if(node != null && node.right != null){
                stack.push(node.right);
            }
            if(node != null){
                node = node.right;
            }
        }
        return array;
    }
}