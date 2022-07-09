class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
         PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        
        for(int num : nums){
            if( pq.size()==k){
                if(pq.peek()<num){
                    pq.poll();
                    pq.offer(num);
                }
            }else{
            pq.offer(num);
                
            }
        }
       int[] res = new int[k]; int idx=0;
        
        for(int i =0; i < nums.length; i++){
            if(pq.contains(nums[i])){
                res[idx++]=nums[i];
                pq.remove(nums[i]);
                
            }
        }
        
        return res;
    }
}