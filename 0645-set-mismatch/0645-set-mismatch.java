class Solution {

    public int[] findErrorNums(int[] nums) {
        int dup = -1;
        int missing = -1;

        int[] arr = new int[nums.length + 1];

        for (int num : nums) {
            arr[num] += 1;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) missing = i;
            if (arr[i] == 2) dup = i;
        }

        return new int[] { dup, missing };
    }
}
