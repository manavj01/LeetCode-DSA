class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int maj = nums.length / 3;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }
        List<Integer> list = new ArrayList<Integer>();

        for (int a : freq.keySet()) {
            if (freq.get(a) > maj) {
                list.add(a);
            }
        }
        return list;
    }
}