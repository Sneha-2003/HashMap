class MyStack {
    Queue<Integer> d;
    public MyStack() {
        d=new LinkedList<Integer>();

    }
    
    public void push(int x) {
        d.add(x);
        int i=1;
        while(i<d.size())
        {
            d.add(d.remove());
            i++;
        }
    }
    
    public int pop() {
        return d.remove();
    }
    
    public int top() {
        return d.peek();
    }
    
    public boolean empty() {
        return d.isEmpty();
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