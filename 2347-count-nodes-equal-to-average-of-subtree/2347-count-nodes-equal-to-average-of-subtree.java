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
    private int count;
    public int averageOfSubtree(TreeNode root) {
        count = 0;
        avgCalc(root);
        return count;
    }

    public int[] avgCalc(TreeNode root){
        int[] res = new int[2];
        if(root == null){
            res[0] = 0;
            res[1] = 0;
            return res;
        }

        int[] leftRes = avgCalc(root.left);
        int[] rightRes = avgCalc(root.right);

        res[0] = root.val + leftRes[0] + rightRes[0];
        res[1] = leftRes[1] + rightRes[1] + 1;

        int average = res[0]/res[1];

        if(average == root.val){
            count++;
        }

        return res;
    }
}