class StockSpanner {
    
    class Pair{
        int first ;
        int second ;
        Pair(int first , int second){
            this.first = first;
            this.second = second;
        }
    }
    Stack<Pair> stack ;
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int stock = price;
        int span = 1;
        
        while(!stack.isEmpty() && stack.peek().first <= price ){
            span += stack.pop().second;
        }
        stack.push(new Pair(stock, span));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */