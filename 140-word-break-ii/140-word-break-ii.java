class Solution {
   public static List<String> wordBreak(String s, List<String> wordDict) {
        ArrayList<String> list = new ArrayList<>();

        solve(wordDict, list, s, "");

        return list;
    }

    public static void solve(List<String> wordDict, ArrayList<String> list, String str, String ans) {
        if (str.length() == 0) {
            
            list.add(ans.trim());
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String left = str.substring(0, i + 1);
            if (wordDict.contains(left)) {
                String right = str.substring(i + 1);
                solve(wordDict, list, right, ans + left + " ");
            }
        }
    }
}