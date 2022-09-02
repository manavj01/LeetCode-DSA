class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            que.add(num);
        }
        
        while(--k > 0){
            que.poll();
            
        }
        
        return que.poll();
    }
}