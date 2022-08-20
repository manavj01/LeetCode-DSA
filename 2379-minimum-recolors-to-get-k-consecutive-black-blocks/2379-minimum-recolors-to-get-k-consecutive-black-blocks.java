class Solution {
//     public int minimumRecolors(String blocks, int k) {
//         int min = Integer.MAX_VALUE;
  
//         for(int i=0; i<=blocks.length()-k; i++){
//              int w= 0;
//              for(int j=i; j<i+k; j++ ){
            
//                 if(blocks.charAt(j)=='W'){
//                      w++;
//                 }
              
//              }
//             min = Math.min(min, w);
            
//         }
        
//         return min;
//     }
     public int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        int i=0;
        int count=0;
        int flips =0; 
        for(int j=0; j<blocks.length(); j++){
            if(blocks.charAt(j)=='W'){
                flips++;
                count++;
            }else {
                count++;
            }
            if(count==k){
                min = Math.min(flips,min);
                count--;
                if(blocks.charAt(i) == 'W'){
                    flips--;
                }
                    i++;
            }
        } 
         
        return min;
    }
}