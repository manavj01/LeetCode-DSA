class Solution {
    public int maxProduct(int[] nums) {
     
        int minPossible = nums[0];
        int maxPossible = nums[0];
        int maxAns = nums[0];
        int maxProduct = nums[0];
        
        int product=1;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<=nums.length-1;i++){
            product*=nums[i];
            max=Math.max(max,product);
            if(product==0)
                product=1;
        }
        
        product=1;
        
        for(int i=nums.length-1;i>=0;i--){
            product*=nums[i];
            max=Math.max(max,product);
            if(product==0)
                product=1;
        }
        return max;
        
        
    }
}