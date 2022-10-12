class Solution {
    public boolean isSubsequence(String s, String t) {
      if(s.isEmpty()) return true;
        int idxS = 0;
        int idxT = 0;
        
        while(idxT < t.length()){
            if(s.charAt(idxS) == t.charAt(idxT)){
                idxS++;
                if(idxS == s.length()) return true;
            }
            idxT++;
        }
        return false;
    }
}