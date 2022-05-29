class Solution {
    public int rearrangeCharacters(String s, String target) {
       HashMap<Character, Integer> fmap = getMap(s);
        HashMap<Character, Integer> tmap = getMap(target);
        int min = Integer.MAX_VALUE;
        
        for (char ch : target.toCharArray()) {
           if (!fmap.containsKey(ch)){
                return 0;
            }
            min = Math.min(min, fmap.get(ch) / tmap.get(ch));
        }
        return min;
    }
    public static HashMap<Character, Integer> getMap(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
        }
        return map;
    }
}