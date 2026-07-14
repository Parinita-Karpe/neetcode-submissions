class MinStack {
        Stack<Integer> minStack;
    public MinStack() {
       minStack=new Stack<>();
    }
    
    public void push(int val) {
        minStack.push(val);
    }
    
    public void pop() {
        minStack.pop();
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
        Stack<Integer> rev=new Stack<>();
        int min=Integer.MAX_VALUE;
        while(!minStack.isEmpty())
        {
        int temp=rev.push(minStack.peek());
        minStack.pop();
        min=Math.min(temp,min);
        }
        while(!rev.isEmpty())
        {minStack.push(rev.peek());
        rev.pop();
        }
        return min;
    }
}
