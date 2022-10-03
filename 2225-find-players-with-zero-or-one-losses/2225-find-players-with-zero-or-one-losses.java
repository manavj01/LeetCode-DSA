class Solution {
    public class Pair{
        int wins =0;
        int loss =0;
        Pair(int wins, int loss){
            this.wins = wins;
            this.loss = loss;
        }
    }
    public List<List<Integer>> findWinners(int[][] matches) {
      HashMap<Integer,Pair> map = new HashMap<>();
        for(int[] match : matches){
            int winner = match[0];
            int looser = match[1];
            
            if(map.containsKey(winner)){
                map.get(winner).wins++;
               
            }else{
                map.put(winner,new Pair(1,0));
            }
            if(map.containsKey(looser)){
                 map.get(looser).loss++;                
            }else{
            map.put(looser,new Pair(0,1));
                
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());
        for(Map.Entry<Integer,Pair> entry : map.entrySet()){
            int key = entry.getKey();
            Pair p = entry.getValue();
           if(p.loss == 0){
               res.get(0).add(key);
           }
            if(p.loss == 1){
               res.get(1).add(key);
           }
            
        }
        Collections.sort(res.get(0));        Collections.sort(res.get(1));

        return res;
    }
    
}