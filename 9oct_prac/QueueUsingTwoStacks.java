public class QueueUsingTwoStacks {

    static class MyStack {
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        Node top;

        void push(int val) {
            Node node = new Node(val);
            node.next = top;
            top = node;
        }

        int pop() {
            if (top == null) {
                throw new IllegalStateException("Stack is empty");
            }
            int val = top.data;
            top = top.next;
            return val;
        }

        int peek() {
            if (top == null) {
                throw new IllegalStateException("Stack is empty");
            }
            return top.data;
        }

        boolean isEmpty() {
            return top == null;
        }
    }

    static class MyQueue {
        private final MyStack inStack = new MyStack();
        private final MyStack outStack = new MyStack();

        public void enqueue(int x) {
            inStack.push(x);
        }

        private void transfer() {
            if (outStack.isEmpty()) {
                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
            }
        }

        public Integer dequeue() {
            transfer();
            if (outStack.isEmpty()) {
                return null;
            }
            return outStack.pop();
        }

        public Integer peek() {
            transfer();
            if (outStack.isEmpty()) {
                return null;
            }
            return outStack.peek();
        }

        public boolean isEmpty() {
            return inStack.isEmpty() && outStack.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front: " + queue.peek());
        System.out.println("Removed: " + queue.dequeue());
        System.out.println("Removed: " + queue.dequeue());

        queue.enqueue(40);

        System.out.println("Front now: " + queue.peek());
        System.out.println("Removed: " + queue.dequeue());
        System.out.println("Removed: " + queue.dequeue());

        System.out.println("Queue empty: " + queue.isEmpty());
        System.out.println("Dequeue on empty queue: " + queue.dequeue());
    }
}
