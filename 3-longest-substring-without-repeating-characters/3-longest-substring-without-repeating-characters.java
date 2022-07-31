class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        if (s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        int maxLen = Integer.MIN_VALUE;


        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (set.contains(ch)){
                    break;
                }
                                    maxLen = Math.max(maxLen,j-i+1);

                set.add(ch);
            }
        }

        return maxLen == Integer.MIN_VALUE ? 0 : maxLen;
    }
}