class Solution {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(
            strs,
            new Comparator<String>() {

                @Override
                public int compare(String s1, String s2) {
                    return s1.length() < s2.length() ? -1 : 1;
                }
            }
        );
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (ch != strs[j].charAt(i)) {
                    return sb.toString();

                //     continue;
                // } else {
                //     // break;
                }
            }
            sb.append(ch);
        }

        return sb.toString();
        // you can also sort by lexographical order
    }
}
