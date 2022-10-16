class Solution {

    int reverse(int n) {
        int val = 0;
        while (n > 0) {
            val = val * 10 + (n % 10);
            n /= 10;
        }
        return val;
    }

    public int countDistinctIntegers(int[] nums) {
       Set<Integer> set = new HashSet<>();
        int val;
        
        for (int num : nums){
            set.add(num);
            val = 0;
            
            while (num > 0){
                val *= 10;
                val += num % 10;
                num /= 10;
            }
            
            set.add(val);
        }
        
        return set.size();
    }
}
