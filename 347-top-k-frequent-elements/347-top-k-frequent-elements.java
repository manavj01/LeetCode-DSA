class Solution {

    class Pair implements Comparable<Pair> {
        int val;
        int times;

        Pair(int val, int times) {
            this.val = val;
            this.times = times;
        }

        public int compareTo(Pair o) {
            return o.times - this.times;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else map.put(num, 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int key : map.keySet()) {
            Pair p = new Pair(key, map.get(key));
            pq.add(p);
        }
        int[] res = new int[k];
        int idx = 0;

        while (k-- > 0) {
            res[idx++] = pq.poll().val;
        }

        return res;
    }
}
