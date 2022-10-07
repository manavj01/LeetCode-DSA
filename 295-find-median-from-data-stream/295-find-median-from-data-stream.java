class MedianFinder {
   PriorityQueue<Integer> min;
   PriorityQueue<Integer> max;


    public MedianFinder() {
        min = new PriorityQueue<>(Collections.reverseOrder());
        max = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        min.add(num);
        if(!max.isEmpty() && !min.isEmpty()){
            if(min.peek() > max.peek()){
                max.add(min.poll());
            }
        }
        if(min.size() > max.size()+1){
            max.offer(min.poll());
        }else if(max.size() > min.size()+1){
            min.offer(max.poll());
        }
    }
    
    public double findMedian() {
      if(min.size() > max.size()){
          return (double)min.peek();
      }else if(max.size() > min.size()){
          return (double)max.peek();
      }else{
          return (min.peek()+max.peek())/2.0;
      }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */