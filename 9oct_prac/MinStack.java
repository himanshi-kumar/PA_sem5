public class MinStack {

    static class Node {
        int value;
        int min;
        Node next;

        Node(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }

    private Node top;

    public void push(int x) {
        int currentMin;
        if (top == null) {
            currentMin = x;
        } else {
            currentMin = Math.min(x, top.min);
        }

        Node node = new Node(x, currentMin);
        node.next = top;
        top = node;
    }

    public Integer pop() {
        if (top == null) {
            return null;
        }
        int val = top.value;
        top = top.next;
        return val;
    }

    public Integer top() {
        if (top == null) {
            return null;
        }
        return top.value;
    }

    public Integer getMin() {
        if (top == null) {
            return null;
        }
        return top.min;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();

        stack.push(5);
        stack.push(3);
        stack.push(3);
        stack.push(7);

        System.out.println("Top: " + stack.top());
        System.out.println("Minimum: " + stack.getMin());

        stack.pop();
        System.out.println("After popping 7, minimum: " + stack.getMin());

        stack.pop();
        System.out.println("After popping one 3, minimum: " + stack.getMin());

        stack.pop();
        System.out.println("After popping the other 3, minimum: " + stack.getMin());

        stack.pop();
        System.out.println("Stack empty: " + stack.isEmpty());
        System.out.println("Minimum on empty stack: " + stack.getMin());
    }
}
