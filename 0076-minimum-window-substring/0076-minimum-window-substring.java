class Solution {

    public String minWindow(String s, String t) {
//         HashMap<Character, Integer> map = new HashMap<>();

//         for (int i = 0; i < t.length(); i++) {
//             map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
//         }
        
//         if(s.length() < t.length()) return "";
//         int length = s.length();
//         int left = 0, right = 0, ansLeft = 0, ansRight = 0;
        
//         int counter = t.length();
        
//         int min = Integer.MAX_VALUE;
       
//         while(right < length){
            
//             char ch = s.charAt(right);
            
//             if(map.containsKey(ch)){
//                 if(map.get(ch) > 0){
//                     counter--;
//                 }
//                 map.put(ch, map.getOrDefault(ch,0)-1);
//             }
            
//             while(counter == 0 && left <= right){
//                 if(right - left + 1 < min){
//                     ansLeft = left;
//                     ansRight = right;
//                     min = right-left+1;
//                 }
//                 ch = s.charAt(left);
                
//                 if(map.containsKey(ch)){
//                     map.put(ch,map.getOrDefault(ch,0)+1);
                   
//                     if(map.get(ch) > 0){
//                         counter++;
//                     }
//                 }
//                 left++;
//             }
//             right++;
//         }
        
        
//         return min == Integer.MAX_VALUE ? "" : s.substring(ansLeft,ansRight+1);
         int [] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }
        int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();
        while (end < s.length()) {
              final char c1 = s.charAt(end);
              if (map[c1] > 0) counter--;
              map[c1]--;
              end++;
              while (counter == 0) {
                    if (minLen > end - start) {
                          minLen = end - start;
                          minStart = start;
                    }
                    final char c2 = s.charAt(start);
                    map[c2]++;
                    if (map[c2] > 0) counter++;
                    start++;
              }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
