class Solution {
    public int removeDuplicates(int[] nums) {
       
        if(nums.length == 1) return 1;
        
        int currentIndex = 0;
        int currentElement = nums[0];
        int index = 1;
        
        while(currentIndex < nums.length) {
            
            while(currentIndex < nums.length && nums[currentIndex] == currentElement) {
                currentIndex++;
            }
            
            if(currentIndex < nums.length) {
               nums[index] = nums[currentIndex];
            index++;
            currentElement = nums[currentIndex]; 
            }
            
            
        }
        
        return index;
     
    }
}