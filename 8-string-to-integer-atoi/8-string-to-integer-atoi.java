class Solution {

    public static int myAtoi(String s) {

        int len = s.length();
        int start = 0;

        while (start < len && s.charAt(start) == ' ') start++;

        if (s == null || len == 0 || start == len) return 0;
        long num = 0;
        int sign = 1;
        if (s.charAt(start) == '-'){
            sign = -1;
            start++;
        }else if (s.charAt(start) == '+') {
            start++;
        }

        for (int i = start; i < len; i++) {
            char ch = s.charAt(i);
            if (ch < 48 || ch > 57) {
                num = num * sign;
                return (int) num;
            }
            num = num * 10 + ch - '0';

            if(sign == -1 && sign*num <Integer.MIN_VALUE) return Integer.MIN_VALUE;
                       if (sign == 1&& num > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        }

        return (int) num*sign;
    }
}
