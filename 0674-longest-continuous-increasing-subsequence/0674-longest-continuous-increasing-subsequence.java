class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLen = Integer.MIN_VALUE;
        int len = 1;
        int i =0;
        int j=1;
        int k = 0;
        while(j<nums.length){
            
            if(nums[k] < nums[j]){
               maxLen = Math.max(maxLen, j-i+1);
            }else{
               i=j; 
            }
            k++;
            j++;
        }
        
        
        return maxLen == Integer.MIN_VALUE ? 1 : maxLen;
    }
}