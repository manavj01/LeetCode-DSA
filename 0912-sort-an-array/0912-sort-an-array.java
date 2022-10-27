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
    // quicksort solution
//      public int[] sortArray(int[] nums) {
//         quickSort(nums, 0 , nums.length-1);
//         return nums;
//     }
//     public  void quickSort(int[] arr , int lo, int hi ){
//         if(lo > hi){
//             return;
//         }
//         int pivot = arr[hi];
//         int pivotIdx = partition(arr, pivot, lo , hi);
        
//         quickSort(arr, lo, pivotIdx-1);        
//         quickSort(arr,  pivotIdx+1, hi);

        
//     }
//     public int partition(int[] arr , int pivot, int lo , int hi){
//         int i = lo , j = lo; 
        
//         while(i<= hi){
//             if(arr[i] <= pivot){
//                 swap(arr, i, j);
//                i++;
//                j++;
//             }else {
//                 i++;
//             }
//         }
        
//         return (j-1);
//     }
//     public void swap (int[] arr , int i , int j){
//         if(i==j) return;
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp ;
//     }
}