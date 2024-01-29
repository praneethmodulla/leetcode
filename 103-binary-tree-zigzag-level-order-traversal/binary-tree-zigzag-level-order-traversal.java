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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null){
            return res;
        }

        queue.add(root);
        int num = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> result = new ArrayList<>();
            for(int i = 0 ; i < size; i++){
                TreeNode node = queue.poll();
                if(node != null){
                    result.add(node.val);
                }
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            if(num%2 == 0){
                res.add(result);
            } else{
                res.add(reverse(result));
            }
            num++;
        }
        return res;
    }

    public List<Integer> reverse(List<Integer> arr){
        int size = arr.size();
        List<Integer> reverse = new ArrayList<>();

        for(int i = size - 1; i >= 0; i--){
            reverse.add(arr.get(i));
        }

        return reverse;
    }
}