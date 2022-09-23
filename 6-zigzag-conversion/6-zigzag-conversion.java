class Solution {

    public String convert(String s, int numRows) {
        StringBuilder[] arr = new StringBuilder[numRows + 1];
        if(numRows == 1 ) return s;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder();
        }
        boolean flag = true;
        int k = 1;
        int i = 0;
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

                if (k < 1) {
                    k += 2;
                    flag = true;
                }
            }
            if(i == s.length()) break;
            
        }
        StringBuilder ans = new StringBuilder();
        for(StringBuilder sb : arr){
            ans.append(sb);
        }
        return ans.toString();
    }
}
