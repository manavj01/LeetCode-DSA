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
        int prev = 0;
        int curr = 0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 48 && ch<= 57){
                curr = curr*10 + ch;
            }else if(curr != 0){
                if(curr <= prev) return false;
                
                prev = curr;
                curr =0;
            }
        }
        
        return curr == 0 || prev < curr;
    }
}
