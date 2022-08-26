class Solution {
    public int findMinArrowShots(int[][] points) {
         Arrays.parallelSort(points, Comparator.comparingInt(a -> a[1]));
        int ans = 0;
        int arrow = 0;
        for (int[] point : points) {
            if (ans ==0 ||point[0] > arrow) {
                ans++;
                arrow = point[1];
            }
        }
        return ans;
    }
}