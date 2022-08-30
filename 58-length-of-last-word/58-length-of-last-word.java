class Solution {
    public int lengthOfLastWord(String s) {
//         int c =0;
//         boolean flag = false;
//         if(s.charAt(s.length()-1) == ' ') flag = true;
       
//         for(int i=s.length()-1 ; i>=0; i--){
//             char ch = s.charAt(i);
//             if(!flag && ch ==' ') break;
//             if(!flag){
//                 if(ch != ' ') c++;
//             }else{
//                 if(ch != ' '){
//                  c++;
//                 flag = false;  
//                 }else  continue;
//             }
//         }
        
//         return c;
        int count=0;   
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ')
                count++;
            else{
                if(count>0)
                    return count;
            }
            
            
        }
        return count;
    }
}