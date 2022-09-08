/*

Steps:

1. Trim front spaces -> by st 
2. Trim last spaces -> by end
3. st to end is the string to reverse 
4. now i = st, j = st
5. loop j till end and do following
     
     a) when j is space char -> reverse word (i to j-1) to handle last word , edge case when j ==n
        and i = j+1
     b) now skip trailing spaces of middle while(str[j]==' ') j++; out of this loop j--; coz j should be last space of middle spaces

     c) we need another marker to remove trailing middle spaces, this mark starts bagging next words that j iterates
        use mark 
        mark is a pointer to keep char of j
        
      if(str[j]!=' '){
         str[mark++]= str[j++];
      }  
        
     all places inside loop where i was taking support of j -> mark replaces j
     after each reverse of word append a space on mark pointer
     
   mark =st; initialize with i and j
   
*/

class Solution {

    public String reverseWords(String s) {
        if (s.length() == 1) return s;
        int n = s.length();
        int st = 0;
        int end = n - 1;
        char[] str = s.toCharArray();
        while (st != n - 1 && str[st] == ' ') {
            st++;
        }
        while (end >= 0 && str[end] == ' ') {
            end--;
        }

        int i = st;
        int j = st;
        int mark = st;
        reverse(str, st, end);
        while (j <= end) {
            
            if (str[j] != ' ') {
                str[mark++] = str[j];
            }

            if (j == end || str[j] == ' ') {
                reverse(str, i, mark - 1);

                 if (j == end) break;

                str[mark++] = ' ';
                i = mark;


                while(str[j] == ' ') j++;
                
                j = j - 1;
            }

            j++;
        }
        // System.out.println(Arrays.toString(str));
        return new String(str, st, mark - st);
    }

    void reverse(char[] str, int l, int h) {
        while (l < h) {
            char tmp = str[l];
            str[l] = str[h];
            str[h] = tmp;

            l++;
            h--;
        }
    }
}
