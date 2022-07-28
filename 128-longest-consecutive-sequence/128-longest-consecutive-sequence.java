class Solution {
    public int longestConsecutive(int[] A) {
 
    if(A.length == 0) return 0; //edge case
  
  PriorityQueue<Integer> pq = new PriorityQueue<>();

    int c = 1; // LCS Counter, set to 1 because a single digit is also consecutive.
 
     for (int a : A) {
        pq.offer(a);
    }

    int a = pq.poll();
    int max= Integer.MIN_VALUE;
	
    while (pq.size()>0) {
	
        int b = pq.poll();
        if (a == b) { // if a==b then we just move forward and update variables
            a = b;
        } else if (a + 1 == b){ // this is when we inc. LCS counter
            c++;
            a = b;
            max = Math.max(max,c); // we take the maximum LCS length and return it(cause there might be multiple)
        }else if (a +1 != b){ // if variables are not equal, refresh counter,and start again
            c=1;
            a=b;
        }
    }

    return max == Integer.MIN_VALUE ? 1 : max;
}
}