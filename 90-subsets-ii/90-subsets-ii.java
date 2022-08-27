class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        solve(res,new ArrayList<>(),nums,0);
        return res;
    }
    
      public void solve(List<List<Integer>> res,List<Integer> temp ,int[] nums, int idx ){
         res.add(new ArrayList<>(temp));

         for (int i=idx; i< nums.length; i++){
            if (i>idx && nums[i] == nums[i-1]) continue; // skip duplicates
            temp.add(nums[i]);
            solve(res,temp,nums,i+1);
            temp.remove(temp.size()-1) ;
        }

    }
}