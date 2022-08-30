class Solution {
    public boolean wordBreak(String s, List<String> wordList) {
    boolean[] T = new boolean[s.length() + 1];
    Set<String> set = new HashSet<>();
    for (String word : wordList) {
        set.add(word);
    }
    T[0] = true;
    for (int i = 1; i <= s.length(); i++) {
        for (int j = 0; j < i; j++) {
            if(T[j] && set.contains(s.substring(j, i))) {
                T[i] = true;
                break;
            }
        }
    }
    return T[s.length()];
    }
}