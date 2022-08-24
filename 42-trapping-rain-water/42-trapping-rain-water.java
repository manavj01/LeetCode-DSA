class Solution {
    public int trap(int[] height) {
         int n = height.length;
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];

        int max = height[0];

        for (int i = 0; i < n; i++) {
            max = Math.max(max, height[i]);
            prefixMax[i] = max;
        }
        max = height[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            suffixMax[i] = max;
        }
        int area =0;
        for (int i=0; i<n; i++){
            area += Math.min(prefixMax[i],suffixMax[i])-height[i];
        }

        return area;
    }
}