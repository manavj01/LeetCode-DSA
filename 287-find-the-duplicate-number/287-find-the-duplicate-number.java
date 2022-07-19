class Solution {
    public int findDuplicate(int[] arr) {
        int[] freq =  new int[arr.length];
        for (int a : arr){
            freq[a]++;
        }
        
        int ret=0;
        for (int i=0; i < freq.length;i++){
            if (freq[i]>1){
                ret= i;
                break;
            }
        }
        return ret;
    }
}