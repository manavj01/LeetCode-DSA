class Solution {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String word : word1) {
            for (int i = 0; i < word.length(); i++) {
                sb1.append(word.charAt(i));
            }
        }
        for (String word : word2) {
            for (int i = 0; i < word.length(); i++) {
                sb2.append(word.charAt(i));
            }
        }
        if (sb1.length() != sb2.length()) return false;

        for (int index = 0; index < sb1.length(); index++) {
            if (sb1.charAt(index) != sb2.charAt(index)) return false;
        }
        return true;
    }
}
