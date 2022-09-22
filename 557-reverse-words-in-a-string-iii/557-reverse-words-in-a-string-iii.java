class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
        StringBuilder temp;
        for(int i=0; i<str.length; i++){
            temp = new StringBuilder(str[i]);
            temp.reverse();
            sb.append(temp).append(" ");
        }
        
        return sb.toString().trim();
    }
}