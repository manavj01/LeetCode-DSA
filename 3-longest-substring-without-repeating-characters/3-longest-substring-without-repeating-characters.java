class Solution {
    public int lengthOfLongestSubstring(String str) {
        if (str.length() == 0) return 0;
        if (str.length() == 1) return 1;

        int maxLen = Integer.MIN_VALUE;

        Set<Character> set = new HashSet<>();
        int l =0;
        for (int r = 0; r < str.length(); r++) {
            if (set.contains(str.charAt(r))){
                while (l<r && set.contains(str.charAt(r))){
                    set.remove(str.charAt(l));
                    l++;
                }
            }
            set.add(str.charAt(r));
            maxLen = Math.max(maxLen,r-l+1);
        }
        return maxLen == Integer.MIN_VALUE ? 0 : maxLen;
    }
}