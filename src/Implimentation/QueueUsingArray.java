package Implimentation;
//https://www.codingninjas.com/codestudio/problems/queue-using-array-or-singly-linked-list_2099908
public class


QueueUsingArray {
    int[] arr;
    int qFront;
    int rear;
    int size;

    QueueUsingArray() {
        // Implement the Constructor
        size = 10001;
        arr = new int[size];
        qFront = 0;
        rear = 0;
    }

    /*----------------- Public Functions of QueueUsingArray -----------------*/

    boolean isEmpty() {
        // Implement the isEmpty() function
        if (qFront == rear)
            return true;
        return false;
    }

    void enqueue(int data) {
        // Implement the enqueue() function
        if (rear == size)
            return;
        arr[rear] = data;
        rear++;
    }

    int dequeue() {
        // Implement the dequeue() function
        int ans = arr[qFront];
        if (qFront == rear) {
            return -1;
        } else {
            arr[qFront] = -1;
            qFront++;

            if (qFront == rear) {
                qFront = 0;
                rear = 0;
            }

            return ans;
        }

    }

    int front() {
        // Implement the front() function
        if (qFront == rear) {
            return -1;
        }

        return arr[qFront];
    }

}

