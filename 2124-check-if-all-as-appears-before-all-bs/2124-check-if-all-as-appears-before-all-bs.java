class Solution {
    public boolean checkString(String s) {
        int ac = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a') ac++;
        }
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                ac--;
            }
            if(s.charAt(i) == 'b' && ac != 0) return false;
        }
        return true;
    }
}