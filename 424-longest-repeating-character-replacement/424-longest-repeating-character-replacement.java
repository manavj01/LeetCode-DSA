class Solution {

    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        int left=0;
        int right = 0;
        
        for (left = 0, right = 0; right < s.length(); right++) {
            int[] freq = new int[26];
                    int maxFreq = 0;

            for (int f = left; f <= right; f++) {
                ++freq[s.charAt(f) - 'A'];
            }
            for(int f =0; f<26; f++)                maxFreq = Math.max(maxFreq, freq[f]);

            System.out.println(maxFreq);
            if ((right - left + 1) - maxFreq <= k) {
                maxLen = Math.max(maxLen, right - left + 1);
            } else {
                // System.out.println(right);
                left++;
            }
        }
        // System.out.println(right+"--"+ left );
        // if ((right - left + 1) - maxFreq <= k) {
        //         maxLen = Math.max(maxLen, right - left + 1);
        //     }
        
        return maxLen;
    }
}
