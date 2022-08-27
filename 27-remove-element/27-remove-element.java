class Solution {
    public int removeElement(int[] nums, int val) {
        
        int idx= 0;
        
        for(int j=0; j<nums.length; j++){
            if(nums[j] != val){
               nums[idx++] = nums[j];
            }
        }
        
    
        return idx;
    }
    
    public void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}