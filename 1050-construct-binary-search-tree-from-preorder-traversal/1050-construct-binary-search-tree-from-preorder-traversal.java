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
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0){
            return null;
        } else if(preorder.length == 1){
            return new TreeNode(preorder[0]);
        }

        TreeNode root = new TreeNode(preorder[0]);

        int rootVal = preorder[0];
        int l_idx = 0;
        int r_idx = preorder.length;

        for(int i = 1; i < preorder.length; i++){
            if(preorder[i] < rootVal){
                l_idx++;
            } else if(preorder[i] > rootVal){
                r_idx = i;
                break;
            }
        }

        int[] leftChild = new int[l_idx];
        int[] rightChild = new int[preorder.length - r_idx];

        for(int i = 0; i < l_idx; i++){
            leftChild[i] = preorder[i + 1];
        }

        for(int i = 0; i < rightChild.length; i++){
            rightChild[i] = preorder[r_idx + i];
        }

        root.left = bstFromPreorder(leftChild);
        root.right = bstFromPreorder(rightChild);

        return root;
    }
}