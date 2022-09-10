class Solution {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
//        Arrays.sort(strs, Comparator.comparingInt(String::length));
        // System.out.println(Arrays.toString(strs));
        int minLen = Integer.MAX_VALUE;
        int minIdx = -1;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLen) {
                minLen = strs[i].length();
                minIdx = i;
            }
        }
        for (int i = 0; i < strs[minIdx].length(); i++) {
            char ch = strs[minIdx].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (ch != strs[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
                return sb.toString();

    }
    // public String longestCommonPrefix(String[] strs) {
    //     if(strs.length ==0) return "";
    //     String prefix = strs[0];
    //     for
    //     (int i=0; i<strs.length; i++)
    //     {
    //         while(strs[i].indexOf(prefix) != 0)
    //         {
    //             prefix= prefix.substring(0, prefix.length()-1);
    //         }
    //     }
    //     return prefix;
    // }
}
