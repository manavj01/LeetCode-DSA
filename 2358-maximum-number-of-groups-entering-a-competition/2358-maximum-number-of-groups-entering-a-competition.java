class Solution {
    public int maximumGroups1(int[] grades) {
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
    public  int maximumGroups(int[] nums) {
        int n = nums.length;
        int i = 0, sum = 0;

        while (sum < n) {
            i++;
            sum = (i * (i + 1)) / 2;
            if (sum == n) return i;
        }
        return i - 1; // i must have gone one step further, so return i-1
    }
}