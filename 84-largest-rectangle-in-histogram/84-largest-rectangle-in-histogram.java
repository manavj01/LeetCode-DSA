class Solution {
    public int largestRectangleArea(int[] arr) {
       
        int n = arr.length;
        int rb[] = new int[n];  //nse index on the right
        Stack<Integer> st = new Stack<>();
        st.push(n - 1);
        rb[n - 1] = n;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            rb[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        int lb[] = new int[n];  //nse index on the left

        st = new Stack<>();
        st.push(0);
        lb[0] = -1;

        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
           
            lb[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = rb[i] - lb[i] - 1;
            int area = arr[i] * width;
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}