class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        
//         for(int i =0 ; i < s.length(); i++){
//           Integer count = hm.get(s.charAt(i));
//            if (count == null) {
//            hm.put(s.charAt(i), 1);
//            }
//            else {
//             hm.put(s.charAt(i), count + 1);
//            }
//         }
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