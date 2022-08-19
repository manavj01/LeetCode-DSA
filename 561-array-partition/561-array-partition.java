class Solution {
    public int arrayPairSum(int[] arr) {
       
        Arrays.sort(arr);
        int msum =0;
        for(int i =0 ; i< arr.length ; i+=2){
            msum += arr[i]; 
        }
        return msum;
        }
}