class Solution {
//     public int longestConsecutive(int[] A) {
 
//     if(A.length == 0) return 0; //edge case
  
//   PriorityQueue<Integer> pq = new PriorityQueue<>();

//     int c = 1; // LCS Counter, set to 1 because a single digit is also consecutive.
 
//      for (int a : A) {
//         pq.offer(a);
//     }

//     int a = pq.poll();
//     int max= Integer.MIN_VALUE;
	
//     while (pq.size()>0) {
	
//         int b = pq.poll();
//         if (a == b) { // if a==b then we just move forward and update variables
//             a = b;
//         } else if (a + 1 == b){ // this is when we inc. LCS counter
//             c++;
//             a = b;
//             max = Math.max(max,c); // we take the maximum LCS length and return it(cause there might be multiple)
//         }else if (a +1 != b){ // if variables are not equal, refresh counter,and start again
//             c=1;
//             a=b;
//         }
//     }

//     return max == Integer.MIN_VALUE ? 1 : max;
// }
//      public  int longestConsecutive(int[] A) {
//          if(A.length ==0) return 0;
//         Arrays.sort(A);
//         int c = 1;
//         int maxc = Integer.MIN_VALUE;
//         for (int i = 1; i < A.length; i++) {
//             int a = A[i - 1];
//             int b = A[i];
//             if (a == b){
//                 continue;
//             } else if (a + 1 == b) {
//                 c++;
//             } else {
//                 c = 1;
//             }
//             maxc = Math.max(c, maxc);
//         }

//         return maxc == Integer.MIN_VALUE ? 1 : maxc;
//     }
    public  int longestConsecutive(int[] A) {
        HashSet<Integer> set = new HashSet<>();

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