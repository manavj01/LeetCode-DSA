public int largestSumAfterKNegations(int[] nums, int k) {
PriorityQueue<Integer> pq = new PriorityQueue<>();
for(int num : nums){
pq.add(num);
}
int sum=0;
for(int i =0 ; i < nums.length; i++){
if(k>0  && pq.peek() < 0){
int a = pq.poll();
pq.add(-a);
k--;
}
}
int min = pq.peek();
for(int i =0 ; i < nums.length; i++) sum += pq.poll();
return sum - k%2 * min* 2 ;
}