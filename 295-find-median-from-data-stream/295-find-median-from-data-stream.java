class MedianFinder {
      PriorityQueue<Integer> min;
        PriorityQueue<Integer> max;

        public MedianFinder() {
            min = new PriorityQueue<>(Collections.reverseOrder());
            max = new PriorityQueue<>();
        }

        public void addNum(int num) {
            min.offer(num);
            if (min.peek() != null && max.peek() != null) {
                if (min.peek() > max.peek()) {
                    max.offer(min.poll());
                }
            }
            if (min.size() > max.size() + 1) {
                max.offer(min.poll());
            } else if (max.size() > min.size() + 1) {
                min.offer(max.poll());
            }
        }

        public double findMedian() {
            if (min.size() > max.size()){
                return min.peek();
            }else if (min.size() < max.size()){
                return max.peek();
            }else {
                return (min.peek() + max.peek())/2.0 ;
            }

        }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */