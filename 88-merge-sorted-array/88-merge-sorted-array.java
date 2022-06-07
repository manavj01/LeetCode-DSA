class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
//         int i =m-1;
//         int j = n-1;
//         int k = m+n-1;
//         if(n == 0){
//             return;
//         }
//         if(m==0){
//             // System.out.println(Arrays.toString(nums1));
//             nums1[0] = nums2[0];
//             return;
//         }
        
        
//         while(k == 0){
//             if(nums2[j]>nums1[i]){
//                 nums1[k] = nums2[j];
                
//                 k--;
//                 j--;
//             }else{
                
//                 nums1[k] = nums1[i];
//                 i--;
//                 k--;
//             }
//         }
int index=m+n-1,bp1=m-1,bp2=n-1;  //bp-->back-pointer
        while(bp1>=0 && bp2>=0){
            if(nums1[bp1] > nums2[bp2]) nums1[index] = nums1[bp1--];
            else nums1[index] = nums2[bp2--];
            index--;
        }
        while(bp1>=0) nums1[index--] = nums1[bp1--];
        while(bp2>=0) nums1[index--] = nums2[bp2--];
    }
}