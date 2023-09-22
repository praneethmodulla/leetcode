class MyQueue {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> stackQueue = new Stack<>();

    public MyQueue() {

    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        while(!stack.isEmpty()){
            int x = stack.pop();
            stackQueue.push(x);
        }
        int popValue = stackQueue.pop();
        while(!stackQueue.isEmpty()){
            int x = stackQueue.pop();
            stack.push(x);
        }
        return popValue;
    }
    
    public int peek() {
        while(!stack.isEmpty()){
            int x = stack.pop();
            stackQueue.push(x);
        }
        int peekValue = stackQueue.peek();
        while(!stackQueue.isEmpty()){
            int x = stackQueue.pop();
            stack.push(x);
        }
        return peekValue;
    }
    
    public boolean empty() {
        return stack.isEmpty() ? true : false; 
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */