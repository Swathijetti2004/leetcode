class MyQueue {
    Stack<Integer> st=new Stack<>();
        Stack<Integer> help=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.add(x);
    }
    
    public int pop() {
        while(st.size()>1){
            help.add(st.pop());
        }
        int val=st.pop();
        while(!help.isEmpty()){
           st.add(help.pop());
        }
        return val;
    }
    
    public int peek() {
        while(st.size()>1){
            help.add(st.pop());
        }
        int val=st.peek();
        while(!help.isEmpty()){
           st.add(help.pop());
        }
        return val;
    }
    
    public boolean empty() {
        return st.size()==0;
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