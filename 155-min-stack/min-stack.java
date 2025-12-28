class MinStack {
    private int[] stackArray;
    private int[] minvalues;
    private int top;
    private int mintop;

    public MinStack() {
        stackArray = new int[10000];
        minvalues = new int[10000];
        top=-1;
        mintop=-1;
    }
    
    public void push(int val) {
        top++;
        stackArray[top]=val;
        if(mintop==-1||val<=minvalues[mintop]){
            mintop++;
            minvalues[mintop]=val;
        }
    }
    
    public void pop() {
        int value = stackArray[top];
        top--;
        if(value==minvalues[mintop]) mintop--;
        
    }
    
    public int top() {
        return stackArray[top];
        
    }
    
    public int getMin() {
        return minvalues[mintop];
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */