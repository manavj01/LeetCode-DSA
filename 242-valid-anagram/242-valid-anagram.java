class Solution {
    public boolean isAnagram(String s, String t) {
       
    int[] orig = new int[26];    
    // int[] anag = new int[26];
    
        for(int i =0 ; i < s.length(); i++){
            orig[s.charAt(i)-'a']++;
        }
        for(int i =0 ; i < t.length(); i++){
            orig[t.charAt(i)-'a']--;
        }
        
//        if (Arrays.equals(orig,anag)){
//            return true;
//        }else return false;
      for(int i : orig) if(i != 0)return false;
        
        return true;
    }
}