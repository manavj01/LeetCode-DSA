class Solution {
    public String breakPalindrome(String pal) {
        if(pal.length() ==1) return "";
        
       char[] arr = pal.toCharArray();
        
        for(int i=0; i<arr.length; i++){
           
            char ch = arr[i];
            if(ch != 'a'){
                arr[i] ='a';
                if(isPalindrome(String.valueOf(arr))){
                     arr[i] = pal.charAt(i);
                    continue;
                }
                break;
            }
            if(i == arr.length-1){
                arr[i]++;
            }

        }
        
        
        return String.valueOf(arr);
    }
    public boolean isPalindrome(String str){
        
        for(int i=0, j = str.length()-1 ; i<str.length(); i++){
            if(i==j) break;
            if(str.charAt(i) != str.charAt(j)) return false;
            j--;
        }
        
        return true;
    }
}