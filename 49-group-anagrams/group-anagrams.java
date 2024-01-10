class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] cArray = strs[i].toCharArray();
            Arrays.sort(cArray);

            if(mp.containsKey(String.valueOf(cArray))){
                List<String> sol = mp.get(String.valueOf(cArray));
                sol.add(strs[i]);
                mp.put(String.valueOf(cArray), sol);
            } else {
                List<String> res = new ArrayList<>();
                res.add(strs[i]);
                mp.put(String.valueOf(cArray), res);
            }
        }

        List<List<String>> result = new ArrayList<List<String>>();

        for(String s : mp.keySet()){
            result.add(mp.get(s));
        }

        return result;
    }
}