class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];
        int idx=0;
        Arrays.fill(ret,-1);
        for(int i=0; i<nums.length; i++){
            int j =i+1;
            while(true){
                if(j==n){
                    j=0;
                }
                if(j==i){
                    ret[idx++] =-1;
                    break;
                }else if(nums[j]>nums[i]){
                    ret[idx++] = nums[j];
                    break;
                }
                    j++;                
            }
            
        }
        
        return ret;
    }
}