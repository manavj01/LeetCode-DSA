class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
         List<List<Integer>> res = new ArrayList<>();

        TreeMap<Integer,Integer> map = new TreeMap<>();

        for (int[] item : items1){
            if (!map.containsKey(item[0])){
                map.put(item[0],item[1]);
            }else map.put(item[0], map.get(item[0])+item[1]);
        }
        for (int[] item : items2){
            if (!map.containsKey(item[0])){
                map.put(item[0],item[1]);
            }else map.put(item[0], map.get(item[0])+item[1]);
        }

        for (int key : map.keySet()){
            List<Integer> weights = new ArrayList<>();
            weights.add(key);
            weights.add(map.get(key));
            res.add(weights);
        }
        return res;
    }
}