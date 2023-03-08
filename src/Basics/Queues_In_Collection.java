package Basics;

import java.util.LinkedList;
import java.util.Queue;

public class Queues_In_Collection {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            que.add(i);
        }

        System.out.println("Elements in Queues Are " + que);

        System.out.println("Front Element of Queue is " + que.peek());

        System.out.println("Size of Queue is " + que.size());

        if (que.isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue is Not Empty");
        }

    }


}
