class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ret = new int[nums.length];
        
        int i=0;
        int idx =0;
        for(int j=n; j<ret.length; j++){
            ret[idx++] = nums[i++];
            ret[idx++] = nums[j];
        }
        
        return ret;
    }
}