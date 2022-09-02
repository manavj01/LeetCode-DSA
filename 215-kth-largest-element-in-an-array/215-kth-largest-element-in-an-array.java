class Solution {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for (int num : nums) {
            que.add(num);

            if (que.size() > k) {
                que.poll();
            }
        }
        return que.peek();

        
    }
}
