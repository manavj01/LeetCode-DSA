class Solution {
    public List<Integer> findAnagrams(String txt, String pat) {
       char[] orig = new char[26];
        char[] anagram = new char[26];
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < pat.length(); i++) {
            orig[pat.charAt(i) - 'a']++;
        }
        int k = pat.length();
        int j = 0, i = 0, anaCount = 0;

        while (j < txt.length()) {
            anagram[txt.charAt(j) - 'a']++;

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (String.valueOf(orig).equals(String.valueOf(anagram))) {
                    anaCount++;
                    arr.add(i);
                }
                anagram[txt.charAt(i) - 'a']--;
                i++;
                j++;
            }
        }
        
        return arr;
    }
}