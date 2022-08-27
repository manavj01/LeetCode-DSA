class Solution {
   public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, target, 0, res, new ArrayList<>());
        return res;
    }

    public void solve(int[] arr, int target, int idx, List<List<Integer>> res, ArrayList<Integer> ans) {
        if (target == 0) {
            res.add(new ArrayList<>(ans));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) {
                break;
            }
            ans.add(arr[i]);
            solve(arr, target - arr[i], i + 1, res, ans);
            ans.remove(ans.size() - 1);
        }

    }
}