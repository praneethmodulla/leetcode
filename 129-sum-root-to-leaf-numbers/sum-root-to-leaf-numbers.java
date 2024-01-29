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
    public int sumNumbers(TreeNode root) {
        List<String> string = new ArrayList<>();
        if(root == null){
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        helper(root, string, sb);
        int sum = 0;
        for(int i = 0; i < string.size(); i++){
            sum += Integer.valueOf(string.get(i));
        }
        return sum;
    }

    public void helper(TreeNode root, List<String> string, StringBuilder sb){
        if(root.left == null && root.right == null){
            sb.append(root.val);
            string.add(sb.toString());
            return;
        }

        sb.append(root.val);
        if(root.left != null){
            helper(root.left, string, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        
        if(root.right != null){
            helper(root.right, string, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        
    }
}