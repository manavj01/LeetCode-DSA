class Solution {
    public int countAsterisks(String s) {
        int c =0;
        boolean flag = false;
        
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '*' && !flag ){
                c++;
            }else if(ch == '|'){
                flag = !flag;
            }
        }
        
//         Stack<Character> st = new Stack<>();
        
//         for(int i = 0 ; i < s.length() ; i++){
//             st.push(s.charAt(i));
//         }
//        while(!st.isEmpty()){
//             char ch =st.pop();
//            if(ch == '*'){
//                c++;
//            }else if(ch == '|'){
//                while(st.peek() !='|'){
//                    st.pop();
//                }
//                st.pop();
//            }
//         }
        return c;
    }
}