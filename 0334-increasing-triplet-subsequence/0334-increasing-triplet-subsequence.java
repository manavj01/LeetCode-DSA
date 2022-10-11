class Solution {

    public boolean increasingTriplet(int[] nums) {
        
//         HashSet<Integer> set = new HashSet<>();
//         for (int num : nums) {
//             set.add(num);
//         }
//         if (set.size()==2) return false;
//         int c=1;
//         for (int i = 0; i < nums.length - 1; i++) {
//             int val = nums[i];
//             c = 1;
//             int cc =1;
//             int spare = nums[i];
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[j] > val) {
//                     c++;
//                     val = nums[j];
//                 }
//                 if(nums[j] > spare && nums[j] != val ){
//                     cc++;
//                     spare = nums[j];
//                 }
//             if (c >= 3) return true;
//             if (cc >=3) return true;
//             }
     
//         }
//         return false;
        if(nums.length < 3) return false;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        
        for(int num : nums){
            if(num <= first){
                first = num;
            }else if(num <= second){
                second = num;
            }else{
                return true;
            }
        }
        return false;
    }
}
