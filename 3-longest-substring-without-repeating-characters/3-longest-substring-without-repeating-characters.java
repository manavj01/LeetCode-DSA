class Solution {
    public int lengthOfLongestSubstring(String str) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        int n = str.length();
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while (right < n) {
            char ch = str.charAt(right);
            if (map.containsKey(ch)) {
                left = Math.max(map.get(ch) + 1, left);
            }
            map.put(ch, right);
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}