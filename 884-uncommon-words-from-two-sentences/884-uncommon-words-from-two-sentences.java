class Solution {
    public String[] uncommonFromSentences(String A, String B) {
//        HashMap<String,Integer> map1 = new HashMap<>();       
       
//      for(String s : s1.split(" ")){
//          if(!map1.containsKey(s)){
//              map1.put(s,1);
//          }else{
//              map1.put(s,map1.get(s)+1);
//          }
//      }
//       for(String s : s2.split(" ")){
//          if(!map1.containsKey(s)){
//              map1.put(s,1);
//          }else{
//              map1.put(s,map1.get(s)+1);
//          }
//      }  
//        ArrayList<String> res = new ArrayList<>();
//         for(String s : map1.keySet()){
//             if(map1.get(s) == 1){
//                 res.add(s);
//             }
//         }
        
      
//         return res.toArray(new String[res.size()]);
         Set<String> distinct = new HashSet<>(), com = new HashSet<>();
        for (String s : (A + " " + B).split("\\s")) {
            if (com.contains(s) || !distinct.add(s)) { 
                distinct.remove(s); com.add(s); 
            }
        }
        return distinct.toArray(new String[distinct.size()]);

    }
}