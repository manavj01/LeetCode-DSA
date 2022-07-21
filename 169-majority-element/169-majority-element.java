class Solution {
    public int majorityElement(int[] nums) {
        int maj = nums.length/2;
        
        HashMap<Integer,Integer> freq = new HashMap<>();
        
        for(int i=0; i < nums.length; i++){
            if(freq.containsKey(nums[i])){
                
                int of = freq.get(nums[i]);
                freq.put(nums[i],of+1);
           
            }else{
                freq.put(nums[i],1);
            }
        }
        int max= Integer.MIN_VALUE;
        for(int a : freq.keySet()){
            if(freq.get(a)> maj){
                max = Math.max(max,a);
            }
        }
        
        
        
        return max;
    }
}