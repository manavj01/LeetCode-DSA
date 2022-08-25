class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransom = new int[26];
        int[] magaz = new int[26];
        
        for(int i=0; i<ransomNote.length(); i++){
            ransom[ransomNote.charAt(i)-97]++;
        }
        for(int i=0; i<magazine.length(); i++){
            magaz[magazine.charAt(i)-97]++;
        }
        boolean flag = true;
        for(int i=0; i<26; i++){
            if(ransom[i] > magaz[i]){
                flag = false;
                break;
            }
        }
        return flag;
        
    }
}