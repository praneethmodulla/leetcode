class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> mp = new HashMap<>();
        mp.put(')', '(');
        mp.put('}', '{');
        mp.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                if(!stack.isEmpty()){
                    if(stack.peek() == mp.get(s.charAt(i))){
                        stack.pop();
                    } else {
                        stack.push(s.charAt(i));
                    }
                } else {
                    stack.push(s.charAt(i));
                }
            } else {
                stack.push(s.charAt(i));
            }
        }

        if(stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}