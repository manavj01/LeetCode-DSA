class Solution {
    public List<List<Integer>> generate(int numRows) {
         
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            Integer[] arr = new Integer[i + 1];
            int si = 0;
            int ei = arr.length - 1;
            arr[si] = 1;
            arr[ei] = 1;

            if (i >= 2) {
                int i1 = 0;
                int i2 = 1;
                for (int idx = si+1; idx < ei; idx++) {
                        arr[idx] = res.get(i-1).get(i1)+res.get(i-1).get(i2);
                        i1++;
                        i2++;
                }
            }
            res.add(Arrays.asList(arr));
        }

        return res;
    }
}