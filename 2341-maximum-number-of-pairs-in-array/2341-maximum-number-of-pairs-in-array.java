class Solution {
    public int[] numberOfPairs1(int[] nums) {
        int nop = 0;
        int nl = 0;

        for (int i = 0; i < nums.length; i++) {
            int p1 = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    int p2 = nums[j];
                    if (p1 != -1 && p2 != -1) {
                        if (p1 == p2) {
                            nums[i] = -1;
                            nums[j] = -1;
                            nop++;
                            break;
                        }
                    }
                }
            }
        }

        for (int a : nums) {
            if (a != -1) nl++;
        }
        System.out.println(Arrays.toString(nums));
        return new int[]{nop, nl};
    }
    public  int[] numberOfPairs(int[] nums) {
        int[] freq = new int[101];
        for (int a : nums){
            freq[a]++;
        }
        int[] ret = new int[2];

        for (int a : freq){
            ret[0] += a/2 ;
            ret[1] += a%2;
        }

        return ret;
    }
}