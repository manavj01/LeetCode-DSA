class Solution {
    public int mostFrequentEven(int[] nums) {
        int [] arr = new int [100001];
        
        for (int num : nums){
            ++arr[num];
        }
        int max = 0;
        int result = -1;
        
        //System.out.println(Arrays.toString(arr));
        
        for (int i = 0; i < arr.length; i += 2){
            //System.out.println(max + " " + arr[i]);
            if (max < arr[i]){
                result = i;
                max = arr[i];
            }
        }
        
        return result;
        
    }
}