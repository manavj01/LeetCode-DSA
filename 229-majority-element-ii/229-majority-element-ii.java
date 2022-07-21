class Solution {
    public List<Integer> majorityElement(int[] nums) {
       Arrays.sort(nums);
        int maj = nums.length / 3;
        int c = 1;
        int element = nums[0];

        List<Integer> list = new LinkedList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == element) {
                c++;
            } else {
                if (c > maj) {
                    list.add(element);
                }
                element = nums[i];
                c = 1;
            }

        }
        if (c>maj){
            list.add(element);
        }
        return list;

    }
}