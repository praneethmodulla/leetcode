class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> firstRow = new ArrayList<Integer>();
        firstRow.add(1);
        res.add(firstRow);
        if(numRows == 1){
            return res;
        }

        for(int i = 1; i < numRows; i++){
            List<Integer> rowVal = new ArrayList<Integer>();
            rowVal.add(1);
            List<Integer> prevRow = res.get(res.size() - 1);
            for(int j = 1; j < prevRow.size(); j++){
                rowVal.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            rowVal.add(1);
            res.add(rowVal);
        }
        return res;
    }
}