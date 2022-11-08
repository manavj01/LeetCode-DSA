class Solution {

    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
//         if(sb.length() == 2 && ) return "";
        
        while (true) {
            for (int i = 0; i < sb.length() - 1; i++) {
                if ( (sb.charAt(i) == sb.charAt(i+ 1) + 32) || (sb.charAt(i) + 32 == sb.charAt(i+ 1)) ) {
                    sb.delete(i, i + 2);
                    break;
                }
            }
            boolean flag = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (( (sb.charAt(i) == sb.charAt( i+1) + 32) || (sb.charAt(i)+32 == sb.charAt( i+1)))) {
                   flag = true;
                }
            }
            if(!flag || sb.length() == 0){
                return sb.toString();
            }
        }
        
        // return s;
    }
}
