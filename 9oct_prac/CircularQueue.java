public class CircularQueue {

    private final int[] arr;
    private final int capacity;
    private int front;
    private int size;

    public CircularQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = 0;
        this.size = 0;
    }

    public boolean offer(int x) {
        if (isFull()) {
            return false;
        }
        int rear = (front + size) % capacity;
        arr[rear] = x;
        size++;
        return true;
    }

    public Integer poll() {
        if (isEmpty()) {
            return null;
        }
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    public Integer front() {
        if (isEmpty()) {
            return null;
        }
        return arr[front];
    }

    public Integer rear() {
        if (isEmpty()) {
            return null;
        }
        int rearIndex = (front + size - 1) % capacity;
        return arr[rearIndex];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(3);

        System.out.println("Offer 10: " + queue.offer(10));
        System.out.println("Offer 20: " + queue.offer(20));
        System.out.println("Offer 30: " + queue.offer(30));

        System.out.println("Queue full: " + queue.isFull());
        System.out.println("Offer 40: " + queue.offer(40));

        System.out.println("Front: " + queue.front());
        System.out.println("Rear: " + queue.rear());

        System.out.println("Poll: " + queue.poll());

        System.out.println("Offer 40: " + queue.offer(40));
        System.out.println("Front after wrap-around: " + queue.front());
        System.out.println("Rear after wrap-around: " + queue.rear());

        System.out.println("Poll: " + queue.poll());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Poll: " + queue.poll());

        System.out.println("Queue empty: " + queue.isEmpty());
        System.out.println("Poll on empty queue: " + queue.poll());
    }
}
