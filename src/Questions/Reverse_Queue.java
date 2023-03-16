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


}
