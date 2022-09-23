class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      Deque<Integer> q = new ArrayDeque<>();  // stores *indices*
        int n = nums.length-k+1;
        List<Integer> res = new ArrayList<>(n);
        int[] result = new int[n];
        int ri=0;
        for (int i = 0; i < nums.length; i++) {
            while (!q.isEmpty() && nums[q.getLast()] <= nums[i]) {
                q.removeLast();
            }
            q.addLast(i);
            // remove first element if it's outside the window
            if (q.getFirst() == i - k) {
                q.removeFirst();
            }
            // if window has k elements add to results (first k-1 windows have < k elements because we start from empty window and add 1 element each iteration)
            if (i >= k - 1) {
                res.add(nums[q.peek()]);
                result[ri++] = nums[q.peek()];
            }
        }
        return result;
        // return res.stream().mapToInt(i->i).toArray();            
    }
}