class Solution {

    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        int left=0;
        int right = 0;
        int maxFreq = 0;
        int[] freq = new int[26];

        for (left = 0, right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;
            
            maxFreq = Math.max(maxFreq,freq[s.charAt(right)-'A']);

            if ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            } 
              maxLen = Math.max(maxLen, right - left + 1);

        }
        
        
        return maxLen;
    }
}
