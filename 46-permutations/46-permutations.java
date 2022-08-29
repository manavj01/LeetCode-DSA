class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, res, 0);
        return res;
    }

    public void solve(int[] nums, List<List<Integer>> res, int index) {
        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int num : nums) ds.add(num);
            res.add(ds);
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            solve(nums, res, index + 1);
            swap(nums, i, index);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}