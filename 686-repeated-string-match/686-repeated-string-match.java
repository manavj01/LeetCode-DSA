class Solution {
     public static int repeatedStringMatch(String A, String B) {
        // StringBuilder str = new StringBuilder(a);
        // int c = 1;
        // int chck = -1;
        // while (str.length() <= b.length() + a.length()) {
        //     chck = str.indexOf(b);
        //     if (chck == -1) {
        //         c++;
        //         str.append(a);
        //     } else {
        //         return c;
        //     }
        // }
        // if(str.indexOf(b) != -1) return c;
        // return -1;
         StringBuilder sb = new StringBuilder();
        int count=0;
        while(sb.length()<=B.length()+A.length()){
            count++;
            sb.append(A);
            if(sb.indexOf(B) != -1){return count;}
        }
        return -1;
    }
}