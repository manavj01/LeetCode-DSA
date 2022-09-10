class Solution {

    public static int repeatedStringMatch(String A, String B) {
        StringBuilder str = new StringBuilder();
        int c = 0;
        // int chck = -1;
        while (str.length() <= A.length() + B.length()) {
            c++;
            str.append(A);
            if (str.indexOf(B) != -1) {
                return c;
            }
        }
        // if (str.indexOf(b) != -1) return c;
        return -1;
        //  StringBuilder sb = new StringBuilder();
        // int count=0;
        // while(sb.length()<=B.length()+A.length()){
        //     count++;
        //     sb.append(A);
        //     if(sb.indexOf(B) != -1){return count;}
        // }
        // return -1;
    }
}
