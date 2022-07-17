class Solution {
     public int maximumSum(int[] nums) {
        int max = -1;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int sum = sumOfDigits(nums[i]);
            if(!map.containsKey(sum)){
                map.put(sum, nums[i]);
            }else{
                max = Math.max(max, nums[i] + map.get(sum));
                map.put(sum, Math.max(nums[i], map.get(sum)));
            }
        }
        return max;
    }
                                
    public int sumOfDigits(int n){
        if(n < 10){
            return n;
        }
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}