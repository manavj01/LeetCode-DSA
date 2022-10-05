class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        solve(nums, 0, res, new ArrayList<>());

        return res;
    }

    public void solve(int[] nums, int idx, List<List<Integer>> res, ArrayList<Integer> arr) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(arr));
            return;
        }
        
        arr.add(nums[idx]);
        solve(nums, idx + 1, res, arr);
        arr.remove(arr.size() - 1);
        solve(nums, idx + 1, res, arr);
    }
}
