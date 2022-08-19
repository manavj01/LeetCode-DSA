class Solution {
   public int heightChecker(int[] heights) {         
   
       int[] freq = new int[101];
       
       for(int a : heights){
           freq[a]++;
       }
       int idx =0;
       int c =0;
       for(int i=1; i<=100; i++){
           while(freq[i]>0){
               if(i != heights[idx]){
                   c++;
               }
               freq[i]--;
               idx++;
           }
       }
       return c;
   }
   
}