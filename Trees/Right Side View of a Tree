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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightView = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return rightView;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int currSize = queue.size();

            for(int i = 0; i < currSize; i++){
                TreeNode node = queue.remove();
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                if( i == currSize - 1){
                    rightView.add(node.val);
                }
            }
        }

        return rightView;
    }
}