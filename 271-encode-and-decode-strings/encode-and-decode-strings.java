public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs){
            sb.append(s.replace("/", "//"));
            sb.append("/:");
        }

        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<String>();
        StringBuilder currString = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == '/' && s.charAt(i + 1) == '/'){
                currString.append('/');
                i++;
            } else if(s.charAt(i) == '/' && s.charAt(i + 1) == ':'){
                result.add(currString.toString());
                i++;
                currString = new StringBuilder();
            } else {
                currString.append(s.charAt(i));
            }
            i++;
        }
        return result;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));