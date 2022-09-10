class Solution {
    public boolean repeatedSubstringPattern(String str) {
         StringBuilder sb = new StringBuilder(str).append(str);
        // System.out.println(sb); 
        sb.delete(sb.length() - 1, sb.length());
        // Removing the first character
        // of a string
                // System.out.println(sb); 

        sb.delete(0, 1);
                // System.out.println(sb); 

        return sb.indexOf(str) == -1 ? false : true;
    }
}