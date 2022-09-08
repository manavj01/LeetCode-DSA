class Solution {
    public String reverseWords(String s) {
       
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        // System.out.println(s);
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(s.charAt(i) == ' ' && s.charAt(i-1) == ' ') continue;
            if(ch == ' '){
                stack.push(sb.toString());
                // stack.push(" ");
                sb = new StringBuilder();
            }else{
           sb.append(ch);
            }
        }
        stack.push(sb.toString());
        // System.out.println(stack);
        sb = new StringBuilder();
        int size = stack.size();
        for(int i=0; i<size; i++){
            if(i== size-1){
            sb.append(stack.pop());
                break;
            }
            sb.append(stack.pop()).append(" ");
        }
      // s = sb.toString();
        return sb.toString();
    }
}