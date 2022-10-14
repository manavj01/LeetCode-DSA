class Solution {

    public int minDeletions(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            ++freq[s.charAt(i) - 'a'];
        }
        
        int c = 0;
        for (int i = 25; i > 0; i--) {
            for (int j = 25; j > 0; j--) {
                Arrays.sort(freq);

                if (freq[j] == 0 && freq[j - 1] == 0) break;

                if (freq[j] == freq[j - 1]) {
                    c++;
                    freq[j - 1]--;
                }
            }
        }
        

        return c;
    }
}
