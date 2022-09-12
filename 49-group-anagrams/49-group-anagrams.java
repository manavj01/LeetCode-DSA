class Solution {

//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> res = new ArrayList<>();
//         int[] hash = new int[strs.length];
//         int idx = 0;
//         for (String strr : strs) {
//             hash[idx] = hashCode(strr);
//             idx++;
//         }
//         System.out.println(Arrays.toString(hash));
//        HashMap<Integer, List<String>> map = new HashMap<>();
        
//         for(int i=0; i<hash.length; i++){
//             int hcode = hash[i];
//             String st = strs[i];
//             map.putIfAbsent(hcode, new ArrayList<String>());
//             map.get(hcode).add(st);
//         }
//        for (Map.Entry<Integer, List<String>> mapElement : map.entrySet()) {

//              List<String> ad = new ArrayList<>(mapElement.getValue());
          
//             res.add(new ArrayList<>(ad));
//         }
    
//         return res;
//     }


//     public int hashCode(String s) {
//         int code = 0;
//         int len = s.length();
//         // System.out.println(len);
//         int p = len-1;
//         for (int i = 0; i < len; i++) {
//             code += (s.charAt(i) - 'a') * (int)Math.pow(26,len);
//                 System.out.println(p);    
//             p--;
//         }

//         return code;
//     }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> mapOfMaps = new HashMap<>();
        for(String str : strs){
            HashMap<Character, Integer> fmap = new HashMap<>();
            for(int i = 0 ; i < str.length(); i++){
                char c = str.charAt(i);
                fmap.merge(c, 1 , Integer::sum);                
            }
            
            if(mapOfMaps.containsKey(fmap) == false){
               ArrayList<String> list = new ArrayList<>();
               list.add(str);
               mapOfMaps.put(fmap, list);
            }else{
               ArrayList<String> list = mapOfMaps.get(fmap);
                list.add(str);
            }
            
        }
        ArrayList<List<String>> ans  = new ArrayList<>();
        for(ArrayList<String> list : mapOfMaps.values()){
            ans.add(list);
        }
        return ans;
    } 
}
