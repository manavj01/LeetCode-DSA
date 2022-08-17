class Solution {
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        k = k % nums.length ;
        int temp = nums.length-k;

        System.out.println(k);
        for(int i=0; i<k; i++ ){
            res[i]= nums[temp++];
        }
        int t = k;
        for(int i=0; i< nums.length-k; i++){
            res[t++] = nums[i];
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = res[i];
        }
        // System.out.println(Arrays.toString(res));

    }
}