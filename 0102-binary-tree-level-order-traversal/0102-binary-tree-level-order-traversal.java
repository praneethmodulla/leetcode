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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        
        queue.add(root);
        

        while(!queue.isEmpty()){
            List<Integer> result = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(node != null){
                    result.add(node.val);
                }
                if(node != null && node.left != null){
                    queue.add(node.left);
                }
                if(node != null && node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(result);
        }

        return res;
    }
}