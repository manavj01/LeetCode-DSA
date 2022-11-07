class Solution {
    public int maximum69Number (int num) {
        int n = num;
        int add = 0;
        int step = 1;
        while(n > 0){
            int d  = n%10;
            n = n/10;
            
            if(d == 6){
                add = 3* step;
            }
            
            step *= 10;
        }
        
        return num+add;
    }
}