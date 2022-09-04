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
        List<Integer>[] bucket = new List[nums.length + 1];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] res = new int[k];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int times = entry.getValue();
            if (bucket[times] == null) {
                bucket[times] = new ArrayList<>();
            }
            bucket[times].add(num);
        }
        for (int i = nums.length; i > 0; i--) {
            if (bucket[i] != null) {
                for (int a : bucket[i])
                    res[--k] = a;
            }
            if (k == 0) break;
        }

        return res;
    }
}
