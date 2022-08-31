class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
//         Set<Integer> set = new HashSet<Integer>();
//         for(int i = 0; i < nums.length; i++){
//             if(i > k) set.remove(nums[i-k-1]);
//             if(!set.add(nums[i])) return true;
//         }
//         return false;
        
         Map<Integer, Integer> mp = new HashMap<>(nums.length);
        
        for (int i = 0; i < nums.length; i++) {
            Integer ord = mp.put(nums[i], i);
            if (ord != null && i - ord <= k)
                return true;
        }
        return false;
    }
}