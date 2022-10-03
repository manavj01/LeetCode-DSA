class MyCalendar {
    List<int[]> booking;
        // int[] bookArr ;
    public MyCalendar() {
        booking = new ArrayList<>();
        // bookArr = new int[(int)1e4];
    }
    
    public boolean book(int start, int end) {
        
        for(int[] it : booking ){
           if(it[0] < end && start <it[1]){
               return false;
           }
        }
       booking.add(new int[]{start,end});
        
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */