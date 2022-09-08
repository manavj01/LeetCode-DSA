class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int n = prices.length;
        stack.push(prices[n-1]);
        
        for(int i= n-2; i>=0; i--){
            
            int val = prices[i];
            if(stack.peek()<=val){
                prices[i] = val-stack.peek();
            }else{
                while(!stack.isEmpty() && stack.peek() > val){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                    prices[i] =val- stack.peek();
                }
            }
            
            stack.push(val);
        }
        
        return prices;
        //  Stack<Integer> stack = new Stack<>();
        // for (int i = 0; i < A.length; i++) {
        //     while (!stack.isEmpty() && A[stack.peek()] >= A[i])
        //         A[stack.pop()] -= A[i];
        //     stack.push(i);
        // }
        // return A;
    }
}