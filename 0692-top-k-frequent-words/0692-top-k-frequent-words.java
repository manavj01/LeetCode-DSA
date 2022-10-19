class Solution {
    public List<String> topKFrequent(String[] words, int k) {
       HashMap<String, Integer> map = new HashMap<>();


        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        ArrayList<String>[] freq = new ArrayList[map.size() + 1];

            // Map.Entry<String,Integer> e : map.entrySet()
        for (Map.Entry<String,Integer> e : map.entrySet()) {
            String word = e.getKey();
            int idx = e.getValue();
            if (freq[idx] == null) {
                freq[idx] = new ArrayList<>();
            }
            freq[idx].add(word);
        }
        List<String> res = new ArrayList<>();
        for (int z = 0; z < k; z++) {
            res.add("");
        }

        int size = freq.length - 1;
        while (size > 0) {
            if (freq[size] == null) {
                size--;
                continue;
            }
            Collections.sort(freq[size]);
            for (int j = 0; j < freq[size].size(); j++) {
                res.set(k-1, freq[size].get(j));
                k--;
                if (k <= 0){
                Collections.reverse(res);
                  return res;  
                } 
            }
            size--;
        }
        return res;
    }
}