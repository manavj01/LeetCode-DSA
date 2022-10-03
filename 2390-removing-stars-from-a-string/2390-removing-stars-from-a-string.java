class Solution {

    public String removeStars(String s) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // key ->char idx
        // val -> star idx 
        int n = s.length();
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                stack.pop();
            }else{
             stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        
        
        // System.out.println(map);
        
        return res.reverse().toString();
    }
}
