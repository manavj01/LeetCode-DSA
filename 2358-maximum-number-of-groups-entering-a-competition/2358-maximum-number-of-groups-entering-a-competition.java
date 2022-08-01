class Solution {
    public int maximumGroups(int[] grades) {
        int i=1;
        int sum=0;
        int c =0;
        int n = grades.length;
        while(sum<n){
            sum = sum+i;
            if(sum>n) break;
            
            i=i+1;
            c++;
            
        }
        return c;
    }
}