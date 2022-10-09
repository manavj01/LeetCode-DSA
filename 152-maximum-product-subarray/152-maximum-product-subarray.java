class Solution {
    public int maxProduct(int[] nums) {
     
//         int product=1;
//         int max=Integer.MIN_VALUE;
        
//         for(int i=0;i<=nums.length-1;i++){
//             product*=nums[i];
//             max=Math.max(max,product);
//             if(product==0)
//                 product=1;
//         }
        
//         product=1;
        
//         for(int i=nums.length-1;i>=0;i--){
//             product*=nums[i];
//             max=Math.max(max,product);
//             if(product==0)
//                 product=1;
//         }
//         return max;
        
        int l = 1; 
        int r = 1;
        int max =Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            l = (l==0 ? 1 : l)* nums[i];
            r = (r == 0 ? 1 : r) * nums[nums.length-i-1];
            max = Math.max(max,Math.max(l,r));
        }
        // [2,-5,-2,-4,3]
        return max;
    }
}