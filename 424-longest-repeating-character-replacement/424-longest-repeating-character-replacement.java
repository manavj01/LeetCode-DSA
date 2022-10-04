class Solution {

    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        int left=0;
        int right = 0;
        int[] freq = new int[26];
                    int maxFreq = 0;

        for ( right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;

            for(int i=0; i<26; i++){
                maxFreq = Math.max(maxFreq,freq[i]);
            }

            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            } 
              maxLen = Math.max(maxLen, right - left + 1);

        }
        
        
        return maxLen;
    }
}
