class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int numNodes = graph.length;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i < graph[0].length; i++){
            result = dfs(0, graph[0][i], numNodes - 1, graph, result);
        }
        return result;
    }

    public static List<List<Integer>> dfs(int srcNode, int node, int destNode, int[][] graph, List<List<Integer>> path){
        if(node == destNode){
            List<Integer> res = new ArrayList<Integer>();
            res.add(srcNode);
            res.add(destNode);
            path.add(res);
            return path;
        }

        for(int i = 0; i < graph[node].length; i++){
            List<List<Integer>> resPath = new ArrayList<List<Integer>>();
            resPath = dfs(node, graph[node][i], destNode, graph, resPath);
            for(List<Integer> paths : resPath){
                paths.add(0, srcNode);
                path.add(paths);
            }
        }

        return path; 
    }
}