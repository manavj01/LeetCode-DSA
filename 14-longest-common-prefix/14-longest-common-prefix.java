class Solution {

    public String longestCommonPrefix(String[] strs) {
//         StringBuilder sb = new StringBuilder();

//         int minLen = Integer.MAX_VALUE;
//         int minIdx = -1;
//         for (int i = 0; i < strs.length; i++) {
//             if (strs[i].length() < minLen) {
//                 minLen = strs[i].length();
//                 minIdx = i;
//             }
//         }
//         for (int i = 0; i < strs[minIdx].length(); i++) {
//             char ch = strs[minIdx].charAt(i);
//             for (int j = 0; j < strs.length; j++) {
//                 if (ch != strs[j].charAt(i)) {
//                     return sb.toString();
//                 }
//             }
//             sb.append(ch);
//         }
//                 return sb.toString();

//     }
   if (strs.length == 0) return "";
        StringBuilder prefix = new StringBuilder(strs[0]);
        for (String str : strs) {
            while (str.indexOf(String.valueOf(prefix)) != 0) {
                prefix = new StringBuilder(prefix.substring(0, prefix.length() - 1));
            }
        }
        return prefix.toString();
    }
}
