class Solution {

    public int[] findRightInterval(int[][] intervals) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = intervals.length;
        int[] sp = new int[n];
        int idx = 0;
        for(int i = 0; i < n; i++) {
            sp[i] = intervals[i][0];            
            map.put(sp[i], i);                  //(key=start_point, val=index)
        }

        Arrays.sort(sp);
        int[] ret = new int[n];
        
        for (int t = 0; t < n; t++) {
            int l = 0;
            int r = n - 1;
            boolean found = false;
            int min = -1;

            int ep = intervals[t][1];
            while (l <= r) {
                int mid = l + (r - l) / 2;
                
                if (sp[mid] >= ep) {
                    found = true;
                    min = sp[mid];
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            ret[t] = found ? map.get(min) : -1;
        }

        return ret;
    }
}
