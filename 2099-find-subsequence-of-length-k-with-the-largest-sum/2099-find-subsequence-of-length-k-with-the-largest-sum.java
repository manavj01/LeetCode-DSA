class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
         HashMap<Integer,Queue<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i],new LinkedList<>());
            map.get(nums[i]).add(i);
        }
        Arrays.sort(nums);
        int a[][] = new int[k][2];
        int index=0;
        for(int i=nums.length-k;i<nums.length;i++){
            a[index][0] = nums[i];
            a[index++][1] = map.get(nums[i]).remove();
        }
        Arrays.sort(a,(x,y)->x[1]-y[1]);  //sort on basis of index
        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = a[i][0];
        }
        return ans;
    }
}