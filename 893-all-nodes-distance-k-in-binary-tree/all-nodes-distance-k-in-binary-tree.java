/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void markParents(TreeNode node, HashMap<TreeNode, TreeNode> parentMap){
        Queue<TreeNode> q = new LinkedList<>();
        if(node == null){
            return;
        }

        q.add(node);
        parentMap.put(node, null);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode currNode = q.poll();
                if(currNode.left != null){
                    parentMap.put(currNode.left, currNode);
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    parentMap.put(currNode.right, currNode);
                    q.add(currNode.right);
                }
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();
        markParents(root, parentMap);

        int currLevel = 0;

        Queue<TreeNode> queue = new LinkedList();
        HashMap<TreeNode, Boolean> visited = new HashMap<>();
        queue.add(target);
        visited.put(target, true);

        while(!queue.isEmpty()){
            int size = queue.size();
            if(currLevel == k){
                break;
            }
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(node.left != null && visited.get(node.left) == null){
                    visited.put(node.left, true);
                    queue.add(node.left);
                }
                if(node.right != null && visited.get(node.right) == null){
                    visited.put(node.right, true);
                    queue.add(node.right);
                }
                if(parentMap.get(node) != null && visited.get(parentMap.get(node)) == null){
                    visited.put(parentMap.get(node), true);
                    queue.add(parentMap.get(node));
                }
            }
            currLevel++;
        }
        List<Integer> result = new ArrayList<>();
        while(!queue.isEmpty()){
            result.add(queue.poll().val);
        }
        return result;
    }
}