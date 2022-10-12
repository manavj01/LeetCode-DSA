class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        subsets2Helper(res, new ArrayList<>(), nums, 0, false);
        return res;
    }

   public static void subsets2Helper(List<List<Integer>> res, ArrayList<Integer> arr, int[] nums, int idx, boolean takePre) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(arr));
            return;
        }

        arr.add(nums[idx]);
        subsets2Helper(res, arr, nums, idx + 1, true);
        arr.remove(arr.size() - 1);
        if (idx >= 1 && nums[idx] == nums[idx - 1] && takePre) return;
        subsets2Helper(res, arr, nums, idx + 1, false);


    }
}
