class Solution {

    public int[] searchRange(int[] nums, int target) {
        int start = findFirst(nums, target);
        int end = findLast(nums, target);
        return new int[] { start, end };
    }

    public int findFirst(int nums[], int target) {
        int i = 0;
        int j = nums.length-1;
        int res = -1;
        while (i <= j) {
            int mid = i + ((j - i) / 2);

            if (nums[mid] < target) {
                i = mid + 1;
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else {
                res = mid;
                j = mid - 1;
            }
        }
        return res;
    }

    public int findLast(int nums[], int target) {
        int i = 0;
        int j = nums.length-1;
        int res = -1;
        while (i <= j) {
            int mid = i + ((j - i) / 2);

            if (nums[mid] > target) {
                j = mid - 1;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                res = mid;
                i = mid + 1;
            }
        }
        return res;
    }
}
