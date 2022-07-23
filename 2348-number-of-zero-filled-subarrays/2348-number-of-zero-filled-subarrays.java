class Solution {
    public long zeroFilledSubarray(int[] arr) {
          long pc = 0;
        long zc = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                pc++;
            } else if (arr[i] != 0) {
                if (pc > 0) {
                    pc = pc * (pc + 1) / 2;
                    zc += pc;
                    pc = 0;
                }
            }
        }

if (pc > 0) {
            pc = pc * (pc + 1) / 2;
            zc += pc;

        }
        return zc;
    }
}