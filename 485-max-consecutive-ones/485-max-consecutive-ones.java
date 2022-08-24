class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxc = Integer.MIN_VALUE;
        int c =0;
        for(int i=0; i<nums.length; i++){
            
            if(nums[i]==1){
                c++;
                maxc = Math.max(c,maxc);
            }else c=0;
        }
        
        return maxc == Integer.MIN_VALUE ? 0 : maxc;
    }
}