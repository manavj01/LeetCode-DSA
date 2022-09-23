// approach 1
while (true) {
while (i < s.length() && flag) {
char ch = s.charAt(i);
i++;
arr[k] = arr[k].append(ch);
k++;
if (k > numRows) {
k -= 2;
flag = false;
}
}
while (i < s.length() && !flag) {
char ch = s.charAt(i);
i++;
arr[k] = arr[k].append(ch);
k--;
​
if (k < 1) {
k += 2;
flag = true;
}
}
if(i == s.length()) break;
}