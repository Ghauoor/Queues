package Implimentation;

class Circular_Queue {
    int[] arr;
    int front;
    int rear;
    int size;

    public Circular_Queue(int k) {
        // Initialize the circular queue with the given size k
        size = k;
        arr = new int[size];
        front = rear = -1;
    }

    public boolean enQueue(int value) {
        // Check if the circular queue is full
        if ((front == 0 && rear == size - 1) || (rear + 1) % size == front) {
            // If the queue is full, return false and do not enqueue the value
            return false;
        } else if (front == -1) {
            // If the queue is empty, set the front and rear pointers to 0 and enqueue the value
            front = rear = 0;
        } else if (rear == size - 1 && front != 0) {
            // If the rear pointer is at the end of the array and the front pointer is not at the beginning,
            // wrap around to the beginning of the array and enqueue the value
            rear = 0;
        } else {
            // Otherwise, increment the rear pointer and enqueue the value
            rear++;
        }
        arr[rear] = value;
        return true;
    }

    public boolean deQueue() {
        // Check if the circular queue is empty
        if (front == -1) {
            // If the queue is empty, return false and do not dequeue any value
            return false;
        }
        if (front == rear) {
            // If the queue has only one element, set the front and rear pointers to -1 to indicate an empty queue
            front = rear = -1;
        } else if (front == size - 1) {
            // If the front pointer is at the end of the array, wrap around to the beginning of the array
            front = 0;
        } else {
            // Otherwise, increment the front pointer
            front++;
        }
        return true;
    }

    public int Front() {
        // Return the value at the front of the queue, or -1 if the queue is empty
        if (front == -1) {
            return -1;
        } else {
            return arr[front];
        }
    }

    public int Rear() {
        // Return the value at the rear of the queue, or -1 if the queue is empty
        if (rear == -1) {
            return -1;
        } else {
            return arr[rear];
        }
    }

    public boolean isEmpty() {
        // Return true if the queue is empty, false otherwise
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        // Return true if the queue is full, false otherwise
        if ((front == 0 && rear == size - 1) || (rear + 1) % size == front) {
            return true;
        } else {
            return false;
        }
    }
}