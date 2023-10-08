class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        if(rowIndex == 0){            
            result.add(1);
            return result;
        }

        if(rowIndex == 1){
            result.add(1);
            result.add(1);
            return result;
        } else {
            List<Integer> res = new ArrayList<>();
            res = getRow(rowIndex - 1);
            result.add(1);
            for(int i = 1; i < res.size(); i++){
                result.add(res.get(i - 1) + res.get(i));
            }
            result.add(1);
            return result;
        }
    }
}