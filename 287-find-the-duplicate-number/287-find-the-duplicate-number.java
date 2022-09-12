class Solution {
    public int findDuplicate(int[] arr) {
        int[] freq =  new int[arr.length];
        for (int i=0; i< arr.length; i++){
            if(freq[arr[i]] >0) return arr[i];
            freq[arr[i]]++;
        }
        
        // int i;
        // for ( i=0; i < freq.length;i++){
        //     if (freq[i]>1){
        //         break;
        //     }
        // }
        return -1;
    }
}