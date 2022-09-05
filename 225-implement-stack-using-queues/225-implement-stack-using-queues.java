class MyStack {
    Queue<Integer> stack;
    public MyStack() {
        stack = new LinkedList<>();
    }
    
    public void push(int x) {
        stack.add(x);
    }
    
    public int pop() {
        int size = stack.size();
        for(int i=1; i<size; i++){
            int a =stack.poll();
            stack.add(a);
        }
        int ret = stack.poll();
        // stack.add(ret);
        return ret;
    }
    
    public int top() {
          int size = stack.size();
        for(int i=1; i<size; i++){
            int a =stack.poll();
            stack.add(a);
        }
        int ret = stack.poll();
        stack.add(ret);
        return ret;
    }
    
    public boolean empty() {
         return stack.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */