class Solution {
    public int findDuplicate(int[] arr) {
        boolean[] flag=new boolean[arr.length+1];
    for(int a:arr){
        if(flag[a]==true){
            return a;
        }
        flag[a]=true;
    }
    return -1;
        // int i;
        // for ( i=0; i < freq.length;i++){
        //     if (freq[i]>1){
        //         break;
        //     }
        // }
    }
}