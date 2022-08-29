class Solution {
    public int arrayPairSum(int[] arr) {
      Arrays.sort(arr);
        int s =0;
        for(int i=0; i<arr.length; i+=2){
            s+= arr[i];
        }
        
        return s;
    }
}