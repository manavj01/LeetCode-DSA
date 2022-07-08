// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        int[] orig = new int[26];
        int[] anag = new int[26];
        
        int i =0; int j =0; int k= pat.length();
        
        for(int z =0 ; z < pat.length(); z++){
          orig[pat.charAt(z)-'a']++;  
        } 
        
        int c=0;
        while(j<txt.length() ){
            anag[txt.charAt(j)-'a']++;
            
            if(j-i + 1 < k ){
                j++;
            }else if(j-i+1 == k){
                if(Arrays.equals(orig,anag)){
                    c++;
                }
                anag[txt.charAt(i)-'a']--;
                i++;
                j++;
            }
        }
        
        return c;
    }
}