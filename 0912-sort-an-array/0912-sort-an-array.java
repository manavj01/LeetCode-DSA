class Solution {
    public int[] sortArray(int[] nums) {
       int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        final int[] numCounts = new int[max - min + 1];
        
        for (int num : nums)
            ++numCounts[num - min];
        
        for (int i = 0, j = 0; i < numCounts.length; ++i)
            while (numCounts[i]-- > 0)  nums[j++] = i + min;
        
        return nums; 
    }
}