class Solution {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(
            strs,
            new Comparator<String>() {

                @Override
                public int compare(final String s1, final String s2) {
                    return s1.length() < s2.length() ? -1 : 1;
                }
            }
        );
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (ch == strs[j].charAt(i)) {
                    continue;
                } else {
                    return sb.toString();
                    // break;
                }
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}
