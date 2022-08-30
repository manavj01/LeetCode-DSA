class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(wordDict.size()==1){
            if(wordDict.contains(s))return true;
            else return false;
        }
        int[] dp = new int[s.length()];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <= i; j++) {
                String w2Check = s.substring(j, i + 1);
                if (wordDict.contains(w2Check)) {
                    if (j > 0) {
                        dp[i] += dp[j - 1];
                    } else {
                        dp[i] += 1;
                    }
                }
            }
        }
        return dp[s.length() - 1] > 0;
    }
}