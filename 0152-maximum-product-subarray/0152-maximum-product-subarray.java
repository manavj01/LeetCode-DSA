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

        int last = 1;
        int prod = 1;
        int max = Integer.MIN_VALUE;
// -1,-2,-3 -> 
        for (int i = 0; i < nums.length; i++) {
            
            prod *= nums[i];
            
            max = Math.max(max, prod);
            if(prod==0){
                prod = 1;
                last = 1;
                continue;
            }
            if(last < 0 && prod < 0 ){
                prod *= last;
                last = 0;
                 max = Math.max(max, prod);

            }
            if (prod < 0) {
                last = prod;
                prod = 1;
            }
        }
        prod = 1;
        last = 1;
        for (int i = nums.length-1; i >=0; i--) {
            
            prod *= nums[i];
            max = Math.max(max, prod);
            if(prod==0){
                prod = 1;
                last = 1;
                continue;
            }
            if(last < 0 && prod < 0 ){
                prod *= last;
                last = 0;
                 max = Math.max(max, prod);

            }
            if (prod < 0) {
                last = prod;
                prod = 1;
            }
            
        }

        return max;
        //         int l = 1;
        //         int r = 1;
        //         int max =Integer.MIN_VALUE;

        //         for(int i=0; i<nums.length; i++){
        //             l = (l==0 ? 1 : l)* nums[i];
        //             r = (r == 0 ? 1 : r) * nums[nums.length-i-1];
        //             max = Math.max(max,Math.max(l,r));
        //         }
        //         // [2,-5,-2,-4,3]
        //         return max;
    }
}
