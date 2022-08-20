class Solution {
    public int secondsToRemoveOccurrences(String s) {
        char[] arr = arr = s.toCharArray();
            int c =0;
            int n = s.length();

        while(true){
                        int temp =0;

                 int j=0;
            while(j<n-1){
                
                if(arr[j]== '0' && arr[j+1]=='1'){
                    arr[j]='1';
                    arr[j+1]='0';
                    temp++;
                    j+=2;
                }else {
                    j++;
                }
            }
            if(temp >0){
                c++;
            }else{
              break;  
            } 
        }
        
        
       return c;
    }
    
    public void swap (char[] arr , int s , int e){
        char ch = arr[s];
        arr[s] = arr[e];
        arr[e] = ch;
    }
}