class Solution {
    public char repeatedCharacter(String s) {
        int[] freq = new int[27];
        char ret ='\u0000';
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
            if(freq[ch-'a'] == 2){
                ret= ch;
                break;
            }
        }
        return ret;
    }
}