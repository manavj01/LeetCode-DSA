class Solution {
    public int removeDuplicates(int[] nums) {
       
        int cNum = nums[0];
        int nc = 0;

        PriorityQueue<Integer> que = new PriorityQueue<>();

        for (int num : nums){
            if (cNum == num){
                nc++;
            }else {
                cNum = num;
                nc=1;
            }
            if (nc <3){
            que.add(num);
            }
        }
        System.out.println(que);
        int size = que.size();
        for (int j=0; j< size; j++){
            nums[j] = que.remove();
        }
        return size;
    }
}