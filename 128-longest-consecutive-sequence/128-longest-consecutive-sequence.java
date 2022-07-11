class Solution {
    public int longestConsecutive(int[] A) {
        if(A.length == 0) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int c = 1;
        for (int a : A) {
            pq.offer(a);
        }

        System.out.println(pq);
//        while (pq.size()>0) System.out.println(pq.poll());

        int a = pq.poll();
        int max= Integer.MIN_VALUE;
        while (pq.size()>0) {
            int b = pq.poll();
            if (a == b) {
                a = b;
            } else if (a + 1 == b){
                c++;
                a = b;
            max = Math.max(max,c);
            }else if (a +1 != b){
                c=1;
                a=b;
            }
        }

        return max== Integer.MIN_VALUE?1:max;
    }
}