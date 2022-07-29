class Solution {

    public  int longestConsecutive(int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int a : A) {
            set.add(a);
        }
        int longestStreak = 0;
        for (int num : A) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;

    }
}