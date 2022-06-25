class Solution {
    public int countAsterisks(String s) {
        int c =0;
        
        Stack<Character> st = new Stack<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            st.push(s.charAt(i));
        }
       while(!st.isEmpty()){
            char ch =st.pop();
           if(ch == '*'){
               c++;
           }else if(ch == '|'){
               while(st.peek() !='|'){
                   st.pop();
               }
               st.pop();
           }
        }
        return c;
    }
}