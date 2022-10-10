class Solution {
    public String breakPalindrome(String pal) {
        if(pal.length() ==1) return "";
        
       char[] arr = pal.toCharArray();
        
        for(int i=0; i<arr.length/2; i++){
           
            char ch = arr[i];
            if(ch != 'a'){
                arr[i] ='a';
                return String.valueOf(arr);
            }

        }
        
        arr[arr.length-1] = 'b';
        
        return String.valueOf(arr);
    }
 
}