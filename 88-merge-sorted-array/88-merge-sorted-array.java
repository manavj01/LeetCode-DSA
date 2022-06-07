class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int[] res = new int[nums1.length];
//         if(nums1.length == 0){
//             for(int i=0; i<nums2.length; i++){
                
//             }
//         }
        
        for(int i =m; i < nums1.length; i++){
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
            
    }
}