class Solution {
   public String reverseWords(String a) {
    char[] s = a.toCharArray();
    int length = 0;
    for (int j = 0; j < s.length; j++) {
        if (s[j] != ' ' || (length > 0 && s[length - 1] != ' '))
            s[length++] = s[j];
    }
    if (length > 0 && s[length - 1] == ' ') length--;
    s = Arrays.copyOf(s, length);
    reverse(s, 0, s.length - 1);
    for (int i = 0, j = 0; j <= s.length; j++) {
        if (j == s.length || s[j] == ' ') {
            reverse(s, i, j - 1);
            i = j + 1;
        }
    }
    return new String(s);
}

private void reverse(char[] s, int i, int j) {
    while (i < j) {
        char tmp = s[i];
        s[i++] = s[j];
        s[j--] = tmp;
    }
}
}