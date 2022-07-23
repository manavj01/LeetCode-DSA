class Solution {
    public String bestHand(int[] ranks, char[] suits) {
         int n = ranks.length;
        int a = 0, b = 0, c = 0, d = 0;
        int[] freq = new int[14];
        for (int i = 0; i < ranks.length; i++) {
            if (suits[i] == 'a') {
                a++;
            } else if (suits[i] == 'b') {
                b++;
            } else if (suits[i] == 'c') {
                c++;
            } else {
                d++;
            }
            freq[ranks[i]]++;
//            hm.put(ranks[i], suits[i]);
        }
        if (a == n || b== n || c == n || d == n){
            return "Flush";
        }
        for (int i=1; i < freq.length; i++){
            if (freq[i]>=3){
                return "Three of a Kind";
            }
        }
        for (int i=1; i < freq.length; i++){
            if (freq[i] == 2){
                return "Pair";
            }
        }


        return "High Card";
    }
}