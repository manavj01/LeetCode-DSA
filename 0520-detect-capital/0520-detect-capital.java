class Solution {

    public boolean detectCapitalUse(String word) {
        if(word.length() > 1){
            if(Character.isLowerCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) return false;
        }
        
        // if (word.charAt(0) < 91) fcap = true;
        for (int i = 1; i < word.length() - 1; i++) {
            if (Character.isLowerCase(word.charAt(i)) && Character.isLowerCase(word.charAt(i + 1))){
                continue;
            } else if (Character.isUpperCase(word.charAt(i)) && Character.isUpperCase(word.charAt(i + 1))) {
                continue;
            }else return false;
        
    }
        return true;
}
}
