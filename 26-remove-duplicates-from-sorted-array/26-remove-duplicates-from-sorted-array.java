class Solution {
    public int removeDuplicates(int[] nums) {
      HashSet<Integer> set = new HashSet<>();
        int idx = 0;
        for(int x:nums){
            if(!set.contains(x)){
                set.add(x);
                nums[idx] = x;
                idx++;
            }
        }
        
        return idx;
    }
}