class Solution {
     public int maximumSum(int[] nums) {
        
         HashMap<Integer,Integer> map = new HashMap<>();
         int max =-1;
         
        for(int i =0 ; i < nums.length; i++){
            int sumOfNum = sum(nums[i]);
            
            if(!map.containsKey(sumOfNum)){
                map.put(sumOfNum,nums[i]);
            }else{
                max = Math.max(max, nums[i] + map.get(sumOfNum));
                map.put(sumOfNum, Math.max(map.get(sumOfNum),nums[i]));
            }
        } 
         
         
         
         return max;
    }
    
    public int sum(int num){
        if(num < 10) return num;
        
        int sum =0;
        while(num > 0){
            sum += num%10;
            num /= 10; 
        }
        
        return sum;
    }
}