class Solution {
     public int[] nextGreaterElements(int[] A) {
        int n = A.length, res[] = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i =  n * 2-1; i >=0; i--) {
            while(!stack.isEmpty() && A[stack.peek()]<= A[i%n]){
                stack.pop();
            }
            res[i%n] = stack.isEmpty() ? -1 : A[stack.peek()];
            stack.push(i%n);
        }
        return res;
    }
    
}