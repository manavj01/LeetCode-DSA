class Solution {
    public int strStr(String haystack, String needle) {
      // if (needle.length() == 0) return 0;
        if (haystack.length() < needle.length()) return -1;
        if (haystack.equals(needle)) return 0;
        int i = 0;
        int j = 0;
        StringBuilder check = new StringBuilder();
        while (i <= haystack.length()) {
            if (check.length() != needle.length()) {
                check.append(haystack.charAt(i));
                i++;
            } else {
                if (check.toString().equals(needle)) {
                    return j;
                } else {
                    check.deleteCharAt(0);
                    if (i==haystack.length()) break;
                    j++;
                }
            }
        }
        return -1;
    }
}