class MyStack {
    Queue<Integer> stack;
    public MyStack() {
        stack = new LinkedList<>();
    }
    
    public void push(int x) {
        int s = stack.size();
        stack.add(x);
        for(int i=0; i<s; i++){
            int y = stack.remove();
            stack.add(y);
        }
    }
    
    public int pop() {
        return stack.remove();
    }
    
    public int top() {
          
        return stack.peek();
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