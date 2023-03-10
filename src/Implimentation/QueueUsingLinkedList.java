package Implimentation;

public class QueueUsingLinkedList {
    Node head;
    Node tail;

    public QueueUsingLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int dequeue() {
        if (head == null) return -1;
        Node temp = head;
        head = head.next;
        if (head == null) tail = null;
        int x = temp.data;
        temp = null;
        return x;
    }

    public int front() {
        if (head == null) return -1;
        return head.data;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

