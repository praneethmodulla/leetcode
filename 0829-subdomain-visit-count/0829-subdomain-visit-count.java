class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> mp = new HashMap<>();
        for(String s : cpdomains){
            String[] str = s.split(" ");
            int count = Integer.parseInt(str[0]);
            String[] stDomains = str[1].split("\\.");
            if(stDomains.length == 3){
                mp.put(stDomains[0] + "." + stDomains[1] + "." + stDomains[2], mp.getOrDefault(stDomains[0] + "." + stDomains[1] + "." + stDomains[2], 0) + count);
                mp.put(stDomains[1] + "." + stDomains[2], mp.getOrDefault(stDomains[1] + "." + stDomains[2], 0) + count);
                mp.put(stDomains[2], mp.getOrDefault(stDomains[2], 0) + count);
            } else if(stDomains.length == 2){
                mp.put(stDomains[0] + "." + stDomains[1], mp.getOrDefault(stDomains[0] + "." + stDomains[1], 0) + count);
                mp.put(stDomains[1], mp.getOrDefault(stDomains[1], 0) + count);
            }
        }

        List<String> result = new ArrayList<>();
        for(String s : mp.keySet()){
            result.add(mp.get(s) + " " + s);
        }

        return result;
    }
}