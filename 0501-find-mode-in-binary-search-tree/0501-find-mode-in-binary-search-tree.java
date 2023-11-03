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
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        mp = dfs(root, mp);
        int max = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<Integer>();
        for(int i : mp.keySet()){
            if(max < mp.get(i)){
                max = mp.get(i);
            }
        }

        for(int i : mp.keySet()){
            if(max == mp.get(i)){
                ans.add(i);
            }
        }
        int[] result = new int[ans.size()];
        for(int j = 0; j < ans.size(); j++){
            result[j] = ans.get(j);
        }

        return result;
    }

    public HashMap<Integer, Integer> dfs(TreeNode node, HashMap<Integer, Integer> map){
        if(node.left == null && node.right == null){
            map.put(node.val, map.getOrDefault(node.val, 0) + 1);
            return map;
        }

        if(node.left != null){
            map = dfs(node.left, map);
        }
        if(node.right != null){
            map = dfs(node.right, map);
        }

        map.put(node.val, map.getOrDefault(node.val, 0) + 1);
        return map;
    }
}