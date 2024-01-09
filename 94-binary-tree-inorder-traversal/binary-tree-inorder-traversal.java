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

        TreeNode currNode = root;

        while(currNode != null || !stack.isEmpty()){
            while(currNode != null){  
                stack.push(currNode);
                currNode = currNode.left;
            }
            currNode = stack.pop();
            if(currNode != null){
                array.add(currNode.val);
            }
            currNode = currNode.right;
        }    
        return array;
    }
}