package Questions;

// https://leetcode.com/problems/design-circular-deque/description/
public class Circular_Deque {

    int[] arr;
    int front;
    int rear;
    int size;

    public Circular_Deque(int k) {
        size = k;
        arr = new int[size];
        front = rear = -1;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;   // If deque is full, return false
        } else if (isEmpty()) {
            front = rear = 0;   // If deque is empty, set front and rear to 0
        } else if (front == 0) {
            front = size - 1;   // If front is at the start, move to the end of the array
        } else {
            front--;    // Move the front pointer to the previous index
        }
        arr[front] = value; // Insert the new element at the front
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;   // If deque is full, return false
        } else if (isEmpty()) {
            front = rear = 0;   // If deque is empty, set front and rear to 0
        } else if (rear == size - 1 && front != 0) {
            rear = 0;   // If rear is at the end, move to the start of the array
        } else {
            rear = (rear + 1) % size;   // Move the rear pointer to the next index
        }
        arr[rear] = value;  // Insert the new element at the rear
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;   // If deque is empty, return false
        }

        if (front == rear) {
            front = rear = -1;  // If deque has only one element, reset front and rear
        } else if (front == size - 1) {
            front = 0;  // If front is at the end, move to the start of the array
        } else {
            front++;   // Move the front pointer to the next index
        }
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;   // If deque is empty, return false
        }

        if (front == rear) {
            front = rear = -1;  // If deque has only one element, reset front and rear
        } else if (rear == 0) {
            rear = size - 1;   // If rear is at the start, move to the end of the array
        } else {
            rear--;   // Move the rear pointer to the previous index
        }
        return true;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];

    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[rear];

    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isFull() {
        if ((front == 0 && rear == size - 1) || (front != 0 && rear == (front - 1) % (size - 1))) {
            return true;
        } else {
            return false;
        }
    }
}

