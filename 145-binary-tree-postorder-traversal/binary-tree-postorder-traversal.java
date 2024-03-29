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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<>();
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();

        if(root == null){
            return postOrder;
        }

        TreeNode node;
        st1.push(root);
        while(!st1.isEmpty()){
            node = st1.pop();
            st2.push(node);
            if(node.left != null){
                st1.push(node.left);
            }
            if(node.right != null){
                st1.push(node.right);
            }
        }

        while(!st2.isEmpty()){
            node = st2.pop();
            postOrder.add(node.val);
        }

        return postOrder;
    }
}