class Solution {

    //     public boolean areNumbersAscending(String s) {
    //         // Pattern pattern = Pattern.compile("[^0-9]");
    //         String numberOnly = s.replaceAll("\\D+", " ");
    //         String[] arr =numberOnly.split(" ");

    //         for(int i=1; i<arr.length; i++){
    //            if( arr[i-1] == "") continue;
    //             int prev = Integer.parseInt(arr[i-1]);
    //             int curr = Integer.parseInt(arr[i]);

    //             if(prev >= curr){
    //                 return false;
    //             }
    //         }
    //         return true;
    //     }
    public boolean areNumbersAscending(String s) {
        int prev = 0, cur = 0;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                cur = cur * 10 + (ch - '0');
            } else if (cur != 0) {
                if (prev >= cur) return false;
                prev = cur;
                cur = 0;
            }
        }
        return cur == 0 || prev < cur;
    }
}
