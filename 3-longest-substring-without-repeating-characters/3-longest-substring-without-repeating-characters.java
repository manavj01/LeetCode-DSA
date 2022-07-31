class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        if(s.length() == 1) return 1;

        int maxLen = Integer.MIN_VALUE;
        int c=0;
        for (int i = 0; i < s.length(); i++) {
        Set<Character> set = new HashSet<>();
            for (int j=i; j<s.length();j++){
                char ch = s.charAt(j);
                if (!set.contains(ch)) {
                    set.add(ch);
                    c++;
                } else {
                    break;
                }
            }
             maxLen = Math.max(maxLen,c);
             c=0;
        }

        return maxLen == Integer.MIN_VALUE ? 0 : maxLen;
    }
}