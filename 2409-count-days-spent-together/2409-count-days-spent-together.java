class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String[] alicearrive = arriveAlice.split("-");
        String[] alicegone = leaveAlice.split("-");
        String[] bobarrive = arriveBob.split("-");
        String[] bobgone = leaveBob.split("-");
        
        int[] dates = {0,31,59,90,120,151,181,212,243,273,304,334,365};
    
        int aliceA = (dates[Integer.parseInt(alicearrive[0])-1] + Integer.parseInt(alicearrive[1]));        
        int aliceG = (dates[Integer.parseInt(alicegone[0])-1] + Integer.parseInt(alicegone[1])) ;
        
        int bobA = (dates[Integer.parseInt(bobarrive[0])-1] + Integer.parseInt(bobarrive[1]));
        int bobG = (dates[Integer.parseInt(bobgone[0])-1] + Integer.parseInt(bobgone[1]));

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