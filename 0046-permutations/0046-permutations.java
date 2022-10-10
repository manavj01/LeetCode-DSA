class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, new ArrayList<Integer>() ,res, new boolean[nums.length]);
        return res;
    }

    public void solve(int[] nums,ArrayList<Integer>arr, List<List<Integer>> res, boolean[] used) {
        if (arr.size() == nums.length) {
            // List<Integer> ds = new ArrayList<>();
            // for (int num : nums) ds.add(num);
            res.add(new ArrayList<>(arr));
        }

        for (int i = 0; i < nums.length; i++) {
            // swap(nums, i, index);
            if(used[i]) continue;
            arr.add(nums[i]);
            used[i] = true;
            solve(nums, arr,res, used);
            // swap(nums, i, index);
            used[i] = false;
            arr.remove(arr.size()-1);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}