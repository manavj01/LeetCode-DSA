class Solution {
    public int singleNonDuplicate(int[] arr) {
        
//         int i=0;
//         int j = arr.length-2;
        
//         while(i<j){
//             int mid = i +(j-i)/2;
            
//             if(mid %2 == 0 && arr[mid]== arr[mid+1]){
//                 i = mid+2;
//             }else if(mid %2 == 1 && arr[mid]== arr[mid-1]){
//                 i = mid+1;
//             }else{
//                 j=mid;
//             }
//         }
        
        
//         return arr[i];
         
        int elem = 0;
        for (int num : arr) {
            elem = elem ^ num;
        }
        return elem;
    }
}