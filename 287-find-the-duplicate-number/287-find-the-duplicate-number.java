class Solution {
    public int findDuplicate(int[] arr) {
        int[] freq =  new int[arr.length];
        for (int a : arr){
            freq[a]++;
        }
        
        int i;
        for ( i=0; i < freq.length;i++){
            if (freq[i]>1){
                break;
            }
        }
        return i;
    }
}