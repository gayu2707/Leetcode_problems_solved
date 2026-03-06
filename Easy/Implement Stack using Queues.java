class MyStack {
    int[] arr = new int[100];
    int top = -1;
    public MyStack() {
        
    }
    
    public void push(int x) {
        arr[++top] = x;
    }
    
    public int pop() {
        return arr[top--];     
    }
    
    public int top() {
        return arr[top];
        
    }
    
    public boolean empty() {
        if(top==-1)
            return true;
        else
        return false;
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