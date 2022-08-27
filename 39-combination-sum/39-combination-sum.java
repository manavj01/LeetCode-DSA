class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        solve(candidates, target, 0, 0, res, new ArrayList<>());
        return res;
    }

    public void solve(int[] arr, int target, int idx, int sum, List<List<Integer>> res, List<Integer> ans) {
        if (idx == arr.length) {
            if (sum == target) {
                res.add(new ArrayList<>(ans));
            }
            return;
        }
        if (arr[idx] <= target - sum) {
            ans.add(arr[idx]);
            solve(arr, target, idx, sum + arr[idx], res, ans);
            ans.remove(ans.size() - 1);
        }
        solve(arr, target, idx + 1, sum, res, ans);
    }
}