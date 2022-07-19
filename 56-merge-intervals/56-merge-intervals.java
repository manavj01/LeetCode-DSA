class Solution {
      class Interval implements Comparable<Interval> {
        int start;
        int end;

        Interval() {
        }

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }


        public int compareTo(Interval other) {
           if (this.start != other.start) {
                return this.start - other.start;
            } else {
                return this.end - other.end;
            }
        }
    }
    
    public int[][] merge(int[][] intervals) {
        Interval[] arr = new Interval[intervals.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Interval(intervals[i][0], intervals[i][1]);

        }
        Arrays.sort(arr);

        Stack<Interval> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                st.push(arr[0]);
            } else {
                Interval top = st.peek();
                if (arr[i].start > top.end) {
                    st.push(arr[i]);
                } else {
                    top.end = Math.max(top.end,arr[i].end);
                }
            }
        }
        int[][] ret = new int[st.size()][2];
        Stack<Interval> rst = new Stack<>();
        while (!st.isEmpty()) rst.add(st.pop());
       int idx=0;
        while (rst.size()>0){
            Interval r = rst.pop();
            ret[idx][0] = r.start;
            ret[idx][1] = r.end;
            idx++;
        }


        return ret;
    }
}