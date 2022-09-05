class MyStack {
     Queue<Integer> stack1;
        Queue<Integer> stack2;

        public MyStack() {
            stack1 = new LinkedList<>();
            stack2 = new LinkedList<>();
        }

        public void push(int x) {
            stack1.add(x);
        }

        public int pop() {
            while(stack1.size() != 1){
                stack2.add(stack1.poll());
            }
            int ret = stack1.poll();
            for(int i=stack2.size()-1; i>=0; i--){
                stack1.add(stack2.poll());
            }
            return ret;
        }

        public int top() {
//            int len = stack1.size();
            for(int i=stack1.size()-1; i>0; i--){
                stack2.add(stack1.poll());
            }
            int ret = stack1.peek();
            stack2.add(stack1.poll());
            for(int i=stack2.size()-1; i>=0; i--){
                stack1.add(stack2.poll());
            }
            return ret;
        }

        public boolean empty() {
            if(stack1.size() != 0){
                return false;
            }
            return true;
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
