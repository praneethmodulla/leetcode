class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char [] s = strs[i].toCharArray();
            Arrays.sort(s);
            List<String> a = new ArrayList<>();
            if(mp.containsKey(String.valueOf(s))){
                a = mp.get(String.valueOf(s));
                a.add(strs[i]);
            } else {
                a.add(strs[i]);
            }
            mp.put(String.valueOf(s), a);
        }

        List<List<String>> result = new ArrayList<>();

        for(String str : mp.keySet()){
            result.add(mp.get(str));
        }

        return result;
    }
}