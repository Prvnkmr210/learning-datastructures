class ArrayQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;

    public ArrayQueue(int size) {
        arr = new int[size];
        capacity = size;
        front = rear = -1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        if (isEmpty())
            front = 0;
        arr[++rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int removed = arr[front];
        if (front == rear)
            front = rear = -1;
        else
            front++;
        return removed;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element: " + queue.peek());
        queue.dequeue();
        System.out.println("Front element after dequeue: " + queue.peek());
    }
}
