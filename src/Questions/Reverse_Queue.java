package Questions;

import java.util.Queue;
import java.util.Stack;

//https://practice.geeksforgeeks.org/problems/queue-reversal/1
public class Reverse_Queue {
    public Queue<Integer> revQue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();

        while (!q.isEmpty()) {
            st.push(q.peek());
            q.remove();
        }

        while (!st.isEmpty()) {
            q.add(st.peek());
            st.pop();
        }

        return q;
    }

    //________________Using Recur________________________

    private Queue<Integer> rev(Queue<Integer> queue) {
        //base case
        if (queue.size() == 0) {
            return queue;
        }

        int front = queue.peek();
        queue.remove();

        //rec
        rev(queue);

        //add again front ele
        queue.add(front);

        return queue;
    }


}
