class MyStack {

    Queue<Integer> q;
    Queue<Integer> helper;

    public MyStack() {
        q = new LinkedList<>();
        helper = new LinkedList<>();
    }

    public void push(int x) {

        helper.add(x);

        while (q.size() != 0) {
            helper.add(q.remove());
        }

        while (helper.size() != 0) {
            q.add(helper.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.size() == 0;
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