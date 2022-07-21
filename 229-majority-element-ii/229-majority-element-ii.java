class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int maj = nums.length / 3;
        int num1 = -1;
        int num2 = -2;
        int c1 = 0;
        int c2 = 0;

        for (int el : nums) {
            if (el == num1) {
                c1++;
            } else if (el == num2) {
                c2++;
            } else if (c1 == 0) {
                num1 = el;
                c1 = 1;
            } else if (c2 == 0) {
                num2 = el;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        c1 = 0;
        c2 = 0;
        for (int num : nums) {
            if (num == num1) {
                c1++;
            } else if (num == num2) {
                c2++;
            }
        }
        if (c1 > maj) {
            ans.add(num1);
        }
        if (c2 > maj) {
            ans.add(num2);
        }
        return ans;

    }

    
}