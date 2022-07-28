class Solution {
    public  List<List<Integer>> fourSum(int[] nums, int target) {
 List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    List<Integer> list = new ArrayList<>();
                    long sch = (long)nums[i] + (long)nums[j] + (long)nums[k];
                    long x = target-sch;
                    // System.out.println(sch);
                    if (binarySearch(nums, x, k + 1, n - 1)) {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(target - (int)sch);
                        if (!lists.contains(list)) {
                            lists.add(list);
                        }
                    }
                }
            }
        }
        return lists;

    }

       public  boolean binarySearch(int[] nums, long target, int si, int ei) {
        int n = nums.length;
        for (int i = si; i < n; i++) {
            int mid = si + (ei - si) / 2;
            if (nums[i] == target) {
                return true;
            }
            if (nums[i] > target) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return false;
    }
}