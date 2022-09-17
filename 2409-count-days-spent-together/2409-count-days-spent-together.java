class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
      
        
        int[] dates = {0,31,59,90,120,151,181,212,243,273,304,334,365};
    
        int aliceA = dates[Integer.parseInt(arriveAlice.substring(0,2))-1]+ Integer.parseInt(arriveAlice.substring(3));     
        int aliceG = dates[Integer.parseInt(leaveAlice.substring(0,2))-1] + Integer.parseInt(leaveAlice.substring(3)) ;
        int bobA = dates[Integer.parseInt(arriveBob.substring(0,2))-1] +Integer.parseInt(arriveBob.substring(3));
        int bobG = dates[Integer.parseInt(leaveBob.substring(0,2))-1] + Integer.parseInt(leaveBob.substring(3));

        int c =0;
        int[] arr = new int[366];
        Arrays.fill(arr,-1);
        for(int i=aliceA; i<=aliceG ; i++){
            arr[i] = 1;
        }
        
        for(int i = bobA ; i <= bobG ; i++ ){
            arr[i]--;
            if(arr[i] == 0) c++;
        }

         
            
        return c;
            
        // return c;
        
    }
}