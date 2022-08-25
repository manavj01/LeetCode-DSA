class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> ret = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i - 1] == nums[i]) continue;

            int lo = i + 1;
            int hi = nums.length - 1;
            while (lo < hi) {
                if (nums[lo] + nums[hi] < -nums[i]) {
                    lo++;
                } else if (nums[lo] + nums[hi] > -nums[i]) {
                    hi--;
                } else {
                    ret.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                    while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                    lo++;
                    hi--;
                }

            }

        }


        return ret;  
    }
}