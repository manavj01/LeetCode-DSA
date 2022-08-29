class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        Arrays.sort(nums);
        solve2(nums, ds, res, freq);
        return res;
    }
     public void solve2(int[] nums, List<Integer> ds, List<List<Integer>> res, boolean[] freq) {
        if (ds.size() == nums.length) {
            res.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                if(i>0 &&nums[i-1]==nums[i] && !freq[i-1]) continue;
                freq[i] = true;
                ds.add(nums[i]);
                solve2(nums, ds, res, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}