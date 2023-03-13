package Questions;

public class Implement_Deque {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    // Constructor
    public Implement_Deque(int n) {
        size = n;
        arr = new int[n];
        front = -1;
        rear = -1;
    }

    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int x) {
        // Check full or not
        if (isFull()) {
            return false;
        } else if (isEmpty()) {
            front = rear = 0;
        } else if (front == 0 && rear != size - 1) {
            front = size - 1;
        } else {
            front--;
        }
        arr[front] = x;
        return true;
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x) {
        if (isFull()) {
            return false;
        } else if (isEmpty()) {
            front = rear = 0;
        } else if (rear == size - 1 && front != 0) {
            rear = 0;
        } else {
            rear++;
        }
        arr[rear] = x;
        return true;
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront() {
        if (isEmpty()) {
            return -1;
        }

        int ans = arr[front];
        arr[front] = -1;

        if (front == rear) { // Single element is present
            front = rear = -1;
        } else if (front == size - 1) {
            front = 0; // To maintain cyclic nature
        } else {
            front++;
        }
        return ans;
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear() {
        if (isEmpty()) {
            return -1;
        }

        int ans = arr[rear];
        arr[rear] = -1;

        if (front == rear) { // Single element is present
            front = rear = -1;
        } else if (rear == 0) {
            rear = size - 1; // To maintain cyclic nature
        } else {
            rear--;
        }
        return ans;
    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[rear];
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull() {
        if ((front == 0 && rear == size - 1) || (front != 0 && rear == (front - 1) % (size - 1))) {
            return true;
        } else {
            return false;
        }
    }
} 