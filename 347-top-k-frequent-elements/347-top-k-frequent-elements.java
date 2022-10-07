class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        PriorityQueue<Pair> pque = new PriorityQueue<>();
        
        for(int key : map.keySet()){
            pque.add(new Pair(map.get(key),key));
        }
        while(k-- >0){
            result[k] = pque.poll().b;
        }
        
        return result;
    }
    class Pair implements Comparable<Pair>{
        int a;
        int b;
        Pair(int a , int b){
            this.a = a;
            this.b = b;
        }
        public int compareTo(Pair o){
            return o.a-this.a;
        }
    }
}