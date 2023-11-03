class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> stack = new Stack<Integer>();
        List<String> result = new ArrayList<String>();
        int j = 0;

        for(int i = 1; i <= n; i++){
            stack.push(i);
            result.add("Push");

            if(j < target.length && target[j] == i){
                j++;
            } else {
                stack.pop();
                result.add("Pop");
            }

            if(j == target.length){
                break;
            }
        }

        return result;
        
    }
}