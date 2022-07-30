class Solution {
    public long zeroFilledSubarray(int[] arr) {

        long pc =0 , zc=0; 
        for(int a : arr){
            if( a==0){
                zc += ++pc;
            }else{
                pc=0;
            }
        }
        return zc;
    }
}