class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransom = new int[126];
        int[] magaz = new int[126];
        
        for(int i=0; i<ransomNote.length(); i++){
            ransom[ransomNote.charAt(i)-'0']++;
        }
        for(int i=0; i<magazine.length(); i++){
            magaz[magazine.charAt(i)-'0']++;
        }
        boolean flag = true;
        for(int i=0; i<126; i++){
            if(ransom[i] > magaz[i]){
                flag = false;
                break;
            }
        }
        return flag;
        
    }
}