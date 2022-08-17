class Solution {
    public void rotate(int[] nums, int k) {
         k  = k % nums.length;
         if(nums == null || nums.length < 2){
        return;
    }
        reverse(nums,0,nums.length-1);        
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

        
    }
    public void reverse(int[] nums , int si , int ei ){
        
        while(si <= ei){
            int temp = nums[si];
            nums[si] = nums[ei];
            nums[ei] = temp;
            si++;
            ei--;
        }
    }
}

// public void rotate(int[] nums, int k) {
//         int[] res = new int[nums.length];
//         k = k % nums.length ;
//         int temp = nums.length-k;

//         for(int i=0; i<k; i++ ){
//             res[i]= nums[temp++];
//         }
//         int t = k;
//         for(int i=0; i< nums.length-k; i++){
//             res[t++] = nums[i];
//         }
//         for(int i=0; i<nums.length; i++){
//             nums[i] = res[i];
//         }

//     }