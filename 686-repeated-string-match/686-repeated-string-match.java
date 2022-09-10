class Solution {
     public static int repeatedStringMatch(String a, String b) {
        StringBuilder str = new StringBuilder(a);
        int c = 1;
        int chck = -1;
        while (str.length() <= b.length() + a.length()) {
            chck = str.indexOf(b);
            if (chck == -1) {
                c++;
                str.append(a);
            } else {
                return c;
            }
        }
        if(str.indexOf(b) != -1) return c;
        return -1;
    }
}