class Solution {

    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        if (n < 3) return 0;
        // int min = nums[0] + nums[1] + nums[2];
        int min = Integer.MAX_VALUE; 
        int ans=0;
        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
            int lo = i + 1;
            int hi = n - 1;
            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi]; // -3
                if (sum == target) return sum;

                // if (Math.abs(target - sum) < Math.abs(target - min)) {
                //     min = sum;
                // }
                if(Math.abs(sum-target) < min){
                    min = Math.abs(sum-target);
                    ans = sum;
                }
                if (sum > target) {
                    hi--;
                } else {
                    lo++;
                }
            }
        }

        return ans;
    }
}
