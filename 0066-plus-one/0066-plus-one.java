class Solution {

    public int[] plusOne(int[] digits) {
        
        int i =digits.length-1;
        if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
        while(i>=0){
            if(digits[i] >= 9){
                i--;
            }else{
                digits[i]++;
                for( i = i+1 ; i <digits.length; i++) digits[i] = 0;
                return digits;
            }   
            
        }
        if(i <0){
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            return ans;
        }
        
        return digits;
    }
}
