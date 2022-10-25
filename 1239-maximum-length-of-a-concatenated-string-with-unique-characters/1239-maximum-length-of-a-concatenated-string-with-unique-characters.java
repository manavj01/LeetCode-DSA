class Solution {

    public int maxLength(List<String> arr) {
        solve(0, "", arr);
        return len;
    }

    private int len = 0;

    public void solve(int idx, String path, List<String> arr) {
        boolean flag = isValid(path);

        if (flag) {
            len = Math.max(len, path.length());
        }
        if (idx == arr.size() || !flag) return;


        for (int i = idx; i < arr.size(); i++) {
            solve(i + 1, path + arr.get(i), arr);
        }
    }

    public boolean isValid(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            if (freq[s.charAt(i) - 'a'] > 1) return false;
        }
        return true;
    }
}
