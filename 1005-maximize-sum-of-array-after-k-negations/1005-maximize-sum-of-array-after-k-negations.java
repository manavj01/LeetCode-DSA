class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        
       Arrays.sort(nums);
        
        for(int i =0 ; i < nums.length && nums[i]<0 && k>0 ;i++){
            nums[i] = -nums[i];
            --k;
        }
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int num : nums){
            if(num<min){
                min = num;
            }
            sum += num;
        }
        
        // System.out.println(Arrays.toString(nums));
        
        return sum - k%2 * min*2 ; 
    }
}