class Solution {
    public int maxProfit(int[] prices) {
       int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int a : prices){
            if (a<min){
                min = a;
            }
            profit = Math.max(profit,a-min);
        }
        return profit;
    }
}