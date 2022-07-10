class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int r = nums[0];
        
        
        for(int i=1, imin =r,imax =r; i < n;i++ ){
            
            if(nums[i]<0){
                imax += (imin-(imin=imax));
            }
            
            imax = Math.max(nums[i], nums[i]* imax);
            imin = Math.min(nums[i], nums[i]* imin);
            
            r = Math.max(r,imax);
        }
        
        return r;
    }
}